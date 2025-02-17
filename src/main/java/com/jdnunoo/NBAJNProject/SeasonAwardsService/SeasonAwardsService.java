package com.jdnunoo.NBAJNProject.SeasonAwardsService;

import com.jdnunoo.NBAJNProject.SeasonAwards.SeasonAwards;
import com.jdnunoo.NBAJNProject.SeasonsAwardsRepository.SeasonAwardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonAwardsService {

    private final SeasonAwardsRepository seasonAwardsRepository;

    @Autowired
    public SeasonAwardsService(SeasonAwardsRepository seasonAwardsRepository){

        this.seasonAwardsRepository = seasonAwardsRepository;
    }

    public List<SeasonAwards> getSeasonsAwards() {
        return seasonAwardsRepository.findAll();
    }


    public List<SeasonAwards> getAllNBATeams() {
        return seasonAwardsRepository.findAllNBATeams();
    }


    public List<SeasonAwards> getAllRookieTeams() {
        return seasonAwardsRepository.findAllRookieTeams();
    }


    public List<SeasonAwards> getAllNBAFirstTeam() {
        return seasonAwardsRepository.findAllNBAFirstTeam();
    }


    public List<SeasonAwards> getAllNBASecondTeam() {
        return seasonAwardsRepository.findAllNBASecondTeam();
    }


    public List<SeasonAwards> getAllNBAThirdTeam() {
        return seasonAwardsRepository.findAllNBAThirdTeam();
    }


    public List<SeasonAwards> getAllDefenseTeams() {
        return seasonAwardsRepository.findAllDefenseTeams();
    }

    public List<SeasonAwards> getAllDefenseFirstTeam() {
        return seasonAwardsRepository.findAllDefenseFirstTeam();
    }

    public List<SeasonAwards> getAllDefenseSecondTeam() {
        return seasonAwardsRepository.findAllDefenseSecondTeam();
    }



}
