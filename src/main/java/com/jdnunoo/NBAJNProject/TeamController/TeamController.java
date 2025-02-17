package com.jdnunoo.NBAJNProject.TeamController;
import com.jdnunoo.NBAJNProject.Team.NBATeam;
import com.jdnunoo.NBAJNProject.TeamService.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private final TeamService teamService;


    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("")
    public List<NBATeam> getTeams(){
        return teamService.getAllTeams();
    }

    @GetMapping("/conference-winners")
    public ResponseEntity<List<NBATeam>> getConferenceChampionTeams(){

        List<NBATeam> conferenceChampionTeams = teamService.getConferenceWinners();
        return ResponseEntity.ok(conferenceChampionTeams);

    }

    @GetMapping("/champions")
     public ResponseEntity<List<NBATeam>> getChampionTeams(){

        List<NBATeam> championTeams = teamService.getChampionTeams();
        return ResponseEntity.ok(championTeams);
    }

}
