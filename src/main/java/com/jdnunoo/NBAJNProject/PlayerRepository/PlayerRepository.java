package com.jdnunoo.NBAJNProject.PlayerRepository;

import com.jdnunoo.NBAJNProject.Player.Player;
import com.jdnunoo.NBAJNProject.Player.PlayerID;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PlayerRepository extends PagingAndSortingRepository<Player, PlayerID> {

    Optional<Player> findById(PlayerID id);

    Page<Player> findAll();
}
