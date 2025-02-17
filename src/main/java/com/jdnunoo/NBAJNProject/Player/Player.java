package com.jdnunoo.NBAJNProject.Player;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats_per_game")
public class Player {


    @EmbeddedId
    private PlayerID id;

    @Column(name = "Pos", nullable = true)
    private String pos;

    @Column(name = "G", nullable = true)
    private Integer gamesPlayed;

    @Column(name = "GS", nullable = true)
    private Integer gamesStarted;

    @Column(name = "MP", nullable = true)
    private Double minutesPlayed;

    @Column(name = "FG", nullable = true)
    private Double fieldGoalsMade;

    @Column(name = "FGA", nullable = true)
    private Double fieldGoalsAttempted;

    @Column(name = "FG%", nullable = true)
    private Double fieldGoalPercentage;

    @Column(name = "3P", nullable = true)
    private Double threePointersMade;

    @Column(name = "3PA", nullable = true)
    private Double threePointersAttempted;

    @Column(name = "3P%", nullable = true)
    private Double threePointPercentage;

    @Column(name = "2P", nullable = true)
    private Double twoPointersMade;

    @Column(name = "2PA", nullable = true)
    private Double twoPointersAttempted;

    @Column(name = "2P%", nullable = true)
    private Double twoPointPercentage;

    @Column(name = "eFG%", nullable = true)
    private Double effectiveFieldGoalPercentage;

    @Column(name = "FT", nullable = true)
    private Double freeThrowsMade;

    @Column(name = "FTA", nullable = true)
    private Double freeThrowsAttempted;

    @Column(name = "FT%", nullable = true)
    private Double freeThrowPercentage;

    @Column(name = "ORB", nullable = true)
    private Double offensiveRebounds;

    @Column(name = "DRB", nullable = true)
    private Double defensiveRebounds;

    @Column(name = "TRB", nullable = true)
    private Double totalRebounds;

    @Column(name = "AST", nullable = true)
    private Double assists;

    @Column(name = "STL", nullable = true)
    private Double steals;

    @Column(name = "BLK", nullable = true)
    private Double blocks;

    @Column(name = "TOV", nullable = true)
    private Double turnovers;

    @Column(name = "PF", nullable = true)
    private Double personalFouls;

    @Column(name = "PTS", nullable = true)
    private Double points;

    @Column(name = "Player Reference", nullable = true, unique = true)
    private String playerReference;

    @Column(name = "League", nullable = true)
    private String league;

    public Player () {


    }


    public Player(PlayerID id, String pos, Integer gamesPlayed, Integer gamesStarted,
                  Double minutesPlayed, Double fieldGoalsMade, Double fieldGoalsAttempted, Double fieldGoalPercentage,
                  Double threePointersMade, Double threePointersAttempted, Double threePointPercentage,
                  Double twoPointersMade, Double twoPointersAttempted, Double twoPointPercentage,
                  Double effectiveFieldGoalPercentage, Double freeThrowsMade, Double freeThrowsAttempted,
                  Double freeThrowPercentage, Double offensiveRebounds, Double defensiveRebounds, Double totalRebounds,
                  Double assists, Double steals, Double blocks, Double turnovers, Double personalFouls, Double points,
                  String playerReference, String league) {

        this.id = id;
        this.pos = pos;
        this.gamesPlayed = gamesPlayed;
        this.gamesStarted = gamesStarted;
        this.minutesPlayed = minutesPlayed;
        this.fieldGoalsMade = fieldGoalsMade;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.threePointersMade = threePointersMade;
        this.threePointersAttempted = threePointersAttempted;
        this.threePointPercentage = threePointPercentage;
        this.twoPointersMade = twoPointersMade;
        this.twoPointersAttempted = twoPointersAttempted;
        this.twoPointPercentage = twoPointPercentage;
        this.effectiveFieldGoalPercentage = effectiveFieldGoalPercentage;
        this.freeThrowsMade = freeThrowsMade;
        this.freeThrowsAttempted = freeThrowsAttempted;
        this.freeThrowPercentage = freeThrowPercentage;
        this.offensiveRebounds = offensiveRebounds;
        this.defensiveRebounds = defensiveRebounds;
        this.totalRebounds = totalRebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.turnovers = turnovers;
        this.personalFouls = personalFouls;
        this.points = points;
        this.playerReference = playerReference;
        this.league = league;
    }

    public PlayerID getId() {
        return id;
    }

    public void setId(PlayerID id) {
        this.id = id;
    }

    public String getPos() { return pos; }
    public void setPos(String pos) { this.pos = pos; }

    public Integer getGamesPlayed() { return gamesPlayed; }
    public void setGamesPlayed(Integer gamesPlayed) { this.gamesPlayed = gamesPlayed; }

    public Integer getGamesStarted() { return gamesStarted; }
    public void setGamesStarted(Integer gamesStarted) { this.gamesStarted = gamesStarted; }

    public Double getMinutesPlayed() { return minutesPlayed; }
    public void setMinutesPlayed(Double minutesPlayed) { this.minutesPlayed = minutesPlayed; }

    public Double getFieldGoalsMade() { return fieldGoalsMade; }
    public void setFieldGoalsMade(Double fieldGoalsMade) { this.fieldGoalsMade = fieldGoalsMade; }

    public Double getFieldGoalsAttempted() { return fieldGoalsAttempted; }
    public void setFieldGoalsAttempted(Double fieldGoalsAttempted) { this.fieldGoalsAttempted = fieldGoalsAttempted; }

    public Double getFieldGoalPercentage() { return fieldGoalPercentage; }
    public void setFieldGoalPercentage(Double fieldGoalPercentage) { this.fieldGoalPercentage = fieldGoalPercentage; }

    public Double getThreePointersMade() { return threePointersMade; }
    public void setThreePointersMade(Double threePointersMade) { this.threePointersMade = threePointersMade; }

    public Double getThreePointersAttempted() { return threePointersAttempted; }
    public void setThreePointersAttempted(Double threePointersAttempted) { this.threePointersAttempted = threePointersAttempted; }

    public Double getThreePointPercentage() { return threePointPercentage; }
    public void setThreePointPercentage(Double threePointPercentage) { this.threePointPercentage = threePointPercentage; }

    public Double getTwoPointersMade() { return twoPointersMade; }
    public void setTwoPointersMade(Double twoPointersMade) { this.twoPointersMade = twoPointersMade; }

    public Double getTwoPointersAttempted() { return twoPointersAttempted; }
    public void setTwoPointersAttempted(Double twoPointersAttempted) { this.twoPointersAttempted = twoPointersAttempted; }

    public Double getTwoPointPercentage() { return twoPointPercentage; }
    public void setTwoPointPercentage(Double twoPointPercentage) { this.twoPointPercentage = twoPointPercentage; }

    public Double getEffectiveFieldGoalPercentage() { return effectiveFieldGoalPercentage; }
    public void setEffectiveFieldGoalPercentage(Double effectiveFieldGoalPercentage) { this.effectiveFieldGoalPercentage = effectiveFieldGoalPercentage; }

    public Double getFreeThrowsMade() { return freeThrowsMade; }
    public void setFreeThrowsMade(Double freeThrowsMade) { this.freeThrowsMade = freeThrowsMade; }

    public Double getFreeThrowsAttempted() { return freeThrowsAttempted; }
    public void setFreeThrowsAttempted(Double freeThrowsAttempted) { this.freeThrowsAttempted = freeThrowsAttempted; }

    public Double getFreeThrowPercentage() { return freeThrowPercentage; }
    public void setFreeThrowPercentage(Double freeThrowPercentage) { this.freeThrowPercentage = freeThrowPercentage; }

    public Double getOffensiveRebounds() { return offensiveRebounds; }
    public void setOffensiveRebounds(Double offensiveRebounds) { this.offensiveRebounds = offensiveRebounds; }

    public Double getDefensiveRebounds() { return defensiveRebounds; }
    public void setDefensiveRebounds(Double defensiveRebounds) { this.defensiveRebounds = defensiveRebounds; }

    public Double getTotalRebounds() { return totalRebounds; }
    public void setTotalRebounds(Double totalRebounds) { this.totalRebounds = totalRebounds; }

    public Double getAssists() { return assists; }
    public void setAssists(Double assists) { this.assists = assists; }

    public Double getSteals() { return steals; }
    public void setSteals(Double steals) { this.steals = steals; }

    public Double getBlocks() { return blocks; }
    public void setBlocks(Double blocks) { this.blocks = blocks; }

    public Double getTurnovers() { return turnovers; }
    public void setTurnovers(Double turnovers) { this.turnovers = turnovers; }

    public Double getPersonalFouls() { return personalFouls; }
    public void setPersonalFouls(Double personalFouls) { this.personalFouls = personalFouls; }

    public Double getPoints() { return points; }
    public void setPoints(Double points) { this.points = points; }

    public String getPlayerReference() { return playerReference; }
    public void setPlayerReference(String playerReference) { this.playerReference = playerReference; }

    public String getLeague() { return league; }
    public void setLeague(String league) { this.league = league; }
}
