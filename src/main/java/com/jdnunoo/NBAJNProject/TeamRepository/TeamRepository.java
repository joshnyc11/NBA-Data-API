package com.jdnunoo.NBAJNProject.TeamRepository;

import com.jdnunoo.NBAJNProject.Team.NBATeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository <NBATeam,String> {



    //returns list of teams that have won at least 1 Championship
    @Query("SELECT t from NBATeam t where t.Championships >= 1 ORDER BY t.Championships DESC")
    List<NBATeam>findTeamsWithChampionships();



    //returns list of teams that have appeared in the NBA Finals
    @Query("SELECT t from NBATeam t where t.conferenceTitles >=1 ORDER BY t.conferenceTitles DESC")
    List<NBATeam> findTeamsWithConferenceChampionships();


    //find a given team
    Optional<NBATeam> findByFranchise(String franchise);
}

