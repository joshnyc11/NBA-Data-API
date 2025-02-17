package com.jdnunoo.NBAJNProject.SeasonAwards;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "end_of_season_teams")
public class SeasonAwards {

    private Integer season;

    @Column(name = "lg")
    private String league;

    @Column(name = "type")
    private String awardType;

    @Column (name = "number_tm")
    private String numberOfTeam;

    private String player;

    private String position;

    @Column(name= "seas_id")
    private Integer seasonId;

    @Id
    @Column(name = "player_id")
    private Integer playerId;

    @Column(name = "birth_year")
    private String birthYear;

    @Column(name = "tm")
    private String team;

    private Integer age;

    public SeasonAwards(){


    }

    public SeasonAwards(Integer season, String league, String awardType, String numberOfTeam,
                        String player, String position, Integer seasonId, Integer playerId,
                        String birthYear, String team, Integer age) {
        this.season = season;
        this.league = league;
        this.awardType = awardType;
        this.numberOfTeam = numberOfTeam;
        this.player = player;
        this.position = position;
        this.seasonId = seasonId;
        this.playerId = playerId;
        this.birthYear = birthYear;
        this.team = team;
        this.age = age;
    }


    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    public String getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(String numberOfTeam) {
        this.numberOfTeam = numberOfTeam;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



}
