package com.jdnunoo.NBAJNProject.SeasonsAwardsRepository;

import com.jdnunoo.NBAJNProject.SeasonAwards.SeasonAwards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeasonAwardsRepository extends JpaRepository <SeasonAwards,Integer> {


    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-NBA'")
    List<SeasonAwards> findAllNBATeams();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-Rookie' ")
    List<SeasonAwards> findAllRookieTeams();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-NBA' AND sa.numberOfTeam = '1st' ")
    List<SeasonAwards> findAllNBAFirstTeam();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-NBA' AND sa.numberOfTeam = '2nd'")
    List<SeasonAwards> findAllNBASecondTeam();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-NBA' AND sa.numberOfTeam = '3rd'")
    List<SeasonAwards> findAllNBAThirdTeam();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-Defense'")
    List<SeasonAwards> findAllDefenseTeams();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-Defense' AND sa.numberOfTeam = '1st'")
    List<SeasonAwards> findAllDefenseFirstTeam();

    @Query("SELECT sa FROM SeasonAwards sa WHERE sa.league = 'NBA' AND sa.awardType = 'All-Defense' AND sa.numberOfTeam = '2nd'")
    List<SeasonAwards> findAllDefenseSecondTeam();
}
