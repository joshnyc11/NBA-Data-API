package com.jdnunoo.NBAJNProject.PlayerService;

import com.jdnunoo.NBAJNProject.Player.Player;
import com.jdnunoo.NBAJNProject.Player.PlayerID;
import com.jdnunoo.NBAJNProject.PlayerRepository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    //returns all players in database. //will need pagination though

    public Page<Player> getAllPlayers(Pageable pageable) {
        return playerRepository.findAll(pageable);
    }

    public Optional<Player> getPlayerById(PlayerID playerID) {
        return playerRepository.findById(playerID);
    }




}
