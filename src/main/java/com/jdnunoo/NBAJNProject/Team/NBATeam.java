package com.jdnunoo.NBAJNProject.Team;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "current_nba_teams")
public class NBATeam {

    @Id
    private String franchise;

    private String league;

    @Column(name = "from_date")
    private String fromDate;

    @Column(name = "to_date")
    private String toDate;

    private Integer Years;

    private Integer Games;

    private Integer Wins;

    private Integer Losses;

    @Column(name = "W/L%")
    private Double  WinLossPCT;

    @Column(name = "Division Titles")
    private Double divisionTitles;

    @Column(name = "Conference Titles")
    private Double conferenceTitles;

    private Double Championships;

    @Column (name = "Team Abbreviation")
    private String teamAbbreviation;


    public NBATeam(){

    }

    public NBATeam(String franchise, String league, String fromDate, String ToDate, Integer Years, Integer Games,
                   Integer Wins, Integer Losses, Double WinLossPCT, Double divisionTitles,
                   Double conferenceTitles, Double Championships, String teamAbbreviation) {
        this.franchise = franchise;
        this.league = league;
        this.fromDate = fromDate;
        this.toDate = ToDate;
        this.Years = Years;
        this.Games = Games;
        this.Wins = Wins;
        this.Losses = Losses;
        this.WinLossPCT = WinLossPCT;
        this.divisionTitles = divisionTitles;
        this.conferenceTitles = conferenceTitles;
        this.Championships = Championships;
        this.teamAbbreviation = teamAbbreviation;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Integer getYears() {
        return Years;
    }

    public void setYears(Integer years) {
        Years = years;
    }

    public Integer getGames() {
        return Games;
    }

    public void setGames(Integer games) {
        Games = games;
    }

    public Integer getWins() {
        return Wins;
    }

    public void setWins(Integer wins) {
        Wins = wins;
    }

    public Integer getLosses() {
        return Losses;
    }

    public void setLosses(Integer losses) {
        Losses = losses;
    }

    public Double getWinLossPCT() {
        return WinLossPCT;
    }

    public void setWinLossPCT(Double winLossPCT) {
        WinLossPCT = winLossPCT;
    }

    public Double getDivisionTitles() {
        return divisionTitles;
    }

    public void setDivisionTitles(Double divisionTitles) {
        this.divisionTitles = divisionTitles;
    }

    public Double getConferenceTitles() {
        return conferenceTitles;
    }

    public void setConferenceTitles(Double conferenceTitles) {
        this.conferenceTitles = conferenceTitles;
    }

    public Double getChampionships() {
        return Championships;
    }

    public void setChampionships(Double championships) {
        Championships = championships;
    }

    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }


}
