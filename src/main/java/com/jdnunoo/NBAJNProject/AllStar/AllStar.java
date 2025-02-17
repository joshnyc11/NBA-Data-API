package com.jdnunoo.NBAJNProject.AllStar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "all_star_selections")
public class AllStar {

    @Id
    private String player;

    private String team;

    @Column(name = "lg")
    private String league;

    private Integer season;


    public AllStar(){

    }

    public AllStar(String player, String team, String league, Integer season){

        this.player = player;
        this.team = team;
        this.league = league;
        this.season = season;

    }



    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

}
