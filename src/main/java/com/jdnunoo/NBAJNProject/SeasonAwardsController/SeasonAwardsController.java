package com.jdnunoo.NBAJNProject.SeasonAwardsController;

import com.jdnunoo.NBAJNProject.SeasonAwards.SeasonAwards;
import com.jdnunoo.NBAJNProject.SeasonAwardsService.SeasonAwardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/season-awards")
public class SeasonAwardsController {


    private final SeasonAwardsService seasonAwardsService;


    @Autowired
    public SeasonAwardsController(SeasonAwardsService seasonAwardsService) {
        this.seasonAwardsService = seasonAwardsService;
    }

    @GetMapping("/all-nba-teams")
    public List<SeasonAwards> getAllNBATeams() {
        return seasonAwardsService.getAllNBATeams();
    }

    @GetMapping("/all-rookie-teams")
    public List<SeasonAwards> getAllRookieTeams() {
        return seasonAwardsService.getAllRookieTeams();
    }

    @GetMapping("/all-nba-first-team")
    public List<SeasonAwards> getAllNBAFirstTeam() {
        return seasonAwardsService.getAllNBAFirstTeam();
    }

    @GetMapping("/all-nba-second-team")
    public List<SeasonAwards> getAllNBASecondTeam() {
        return seasonAwardsService.getAllNBASecondTeam();
    }

    @GetMapping("/all-nba-third-team")
    public List<SeasonAwards> getAllNBAThirdTeam() {
        return seasonAwardsService.getAllNBAThirdTeam();
    }

    @GetMapping("/all-defense-teams")
    public List<SeasonAwards> getAllDefenseTeams() {
        return seasonAwardsService.getAllDefenseTeams();
    }

    @GetMapping("/all-defense-first-team")
    public List<SeasonAwards> getAllDefenseFirstTeam() {
        return seasonAwardsService.getAllDefenseFirstTeam();
    }

    @GetMapping("/all-defense-second-team")
    public List<SeasonAwards> getAllDefenseSecondTeam() {
        return seasonAwardsService.getAllDefenseSecondTeam();
    }

}
