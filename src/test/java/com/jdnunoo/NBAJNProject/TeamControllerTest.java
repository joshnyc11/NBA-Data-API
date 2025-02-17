package com.jdnunoo.NBAJNProject;

import com.jdnunoo.NBAJNProject.Team.NBATeam;
import com.jdnunoo.NBAJNProject.TeamController.TeamController;
import com.jdnunoo.NBAJNProject.TeamService.TeamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TeamControllerTest {

    @Mock
    private TeamService teamService;

    @InjectMocks
    private TeamController teamController;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetTeams(){

        List<NBATeam> mockTeams = Arrays.asList(new NBATeam("Heat", "NBA", "1988-89", "2023-24", 34, 2858,
                1505, 1353, 0.527, 16.0,
                7.0, 3.0, "MIA"), new NBATeam ("Nuggets", "NBA/ABA", "1967-68", "2023-24", 57, 4586,
                2346, 2240, 0.512, 4.0,
                1.0, 1.0, "DEN"));

        when(teamService.getAllTeams()).thenReturn(mockTeams);

        List<NBATeam> result = teamController.getTeams();

        assertEquals(2, result.size());

        assertEquals("Heat",result.get(0).getFranchise());
        assertEquals("Nuggets",result.get(1).getFranchise());

    }

    @Test
    void testGetConferenceChampionTeams(){

        List<NBATeam> mockTeams = Arrays.asList(new NBATeam("Heat", "NBA", "1988-89", "2023-24", 34, 2858,
                1505, 1353, 0.527, 16.0,
                7.0, 3.0, "MIA"), new NBATeam ("Nuggets", "NBA/ABA", "1967-68", "2023-24", 57, 4586,
                2346, 2240, 0.512, 4.0,
                1.0, 1.0, "DEN"));
        when(teamService.getConferenceWinners()).thenReturn(mockTeams);

        ResponseEntity<List<NBATeam>> response = teamController.getConferenceChampionTeams();

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().size());
        assertEquals("Heat", response.getBody().get(0).getFranchise());
        assertEquals("Nuggets", response.getBody().get(1).getFranchise());
    }
















}
