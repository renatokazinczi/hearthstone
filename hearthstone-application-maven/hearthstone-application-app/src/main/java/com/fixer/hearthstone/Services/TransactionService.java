package com.fixer.hearthstone.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fixer.hearthstone.domain.Player;
import com.fixer.hearthstone.repository.PlayerRepository;

@Component
public class TransactionService {
    private static final Logger logger = LoggerFactory.getLogger(TransactionService.class);

    @Autowired
    PlayerRepository playerRepository;

    @Transactional
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    @Transactional
    public List<Player> listPlayers() {
        List<Player> players = playerRepository.findAll();
        for (Player player : players) {
            logger.info(player.toString());
        }
        return players;
    }
}
