package com.fixer.hearthstone.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fixer.hearthstone.domain.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    @Override
    List<Player> findAll();
}
