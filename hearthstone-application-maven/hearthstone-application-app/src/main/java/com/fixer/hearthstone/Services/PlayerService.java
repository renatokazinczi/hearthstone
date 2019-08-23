package com.fixer.hearthstone.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixer.hearthstone.repository.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public Long count() {

        return playerRepository.count();
    }

    public void deleteById(Integer userId) {

        playerRepository.deleteById(userId);
    }
}
