package com.jdnunoo.NBAJNProject.PlayerController;


import com.jdnunoo.NBAJNProject.Player.Player;

import com.jdnunoo.NBAJNProject.PlayerService.PlayerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

   // localhost:8080/api/player?page=page_number&size=type_number_here
    @GetMapping("")
    public Page<Player> findAll(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size){

        PageRequest pr = PageRequest.of(page,size);

        return playerService.getAllPlayers(pr);
    }

}
