package com.jdnunoo.NBAJNProject.TeamService;

import com.jdnunoo.NBAJNProject.Team.NBATeam;
import com.jdnunoo.NBAJNProject.TeamRepository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    public final TeamRepository teamRepository;

    @Autowired
    public TeamService (TeamRepository teamRepository) {

       this.teamRepository = teamRepository;
    }

    //returns all teams
    public List<NBATeam> getAllTeams(){

        return teamRepository.findAll();
    }

    public List<NBATeam> getChampionTeams(){
        return teamRepository.findTeamsWithChampionships();
    }

    public List<NBATeam> getConferenceWinners(){

        return teamRepository.findTeamsWithConferenceChampionships();
    }

    public Optional<NBATeam> getTeamByFranchise(String franchise) {
        return teamRepository.findByFranchise(franchise);
    }


}
