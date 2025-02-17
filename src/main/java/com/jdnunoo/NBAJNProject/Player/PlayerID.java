package com.jdnunoo.NBAJNProject.Player;

import jakarta.persistence.Column;


import java.io.Serializable;
import java.util.Objects;

public class PlayerID implements Serializable {

    @Column(name = "Player")
    private String player;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Tm")
    private String team;

    @Column(name = "Season")
    private String season;


    public PlayerID() {}


    public PlayerID(String player, Integer age, String team, String season) {
        this.player = player;
        this.age = age;
        this.team = team;
        this.season = season;
    }

    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerID that = (PlayerID) o;
        return Objects.equals(player, that.player) &&
                Objects.equals(age, that.age) &&
                Objects.equals(team, that.team) &&
                Objects.equals(season, that.season);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, age, team, season);
    }



}
