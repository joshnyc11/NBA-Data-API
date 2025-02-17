package com.jdnunoo.NBAJNProject;


import com.jdnunoo.NBAJNProject.Team.NBATeam;
import com.jdnunoo.NBAJNProject.TeamRepository.TeamRepository;
import com.jdnunoo.NBAJNProject.TeamService.TeamService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class TeamServiceTest {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamService teamService;

    @Test
    void getAllTeams() {

        // given
        NBATeam nbateam1 = new NBATeam("Atlanta Hawks", "NBA", "1949-50", "2023-24", 75, 5910,
                2915, 2995, 0.493, 12.0,
                0.0, 1.0, "ATL");

        NBATeam nbateam2 = new NBATeam("Charlotte Hornets", "NBA", "1988-89", "2023-24", 34, 2685,
                1166, 1519, 0.434, 0.0,
                0.0, 0.0, "CHA");



        List<NBATeam> teamList = Arrays.asList(nbateam1, nbateam2);

        Mockito.when(teamRepository.findAll()).thenReturn(teamList);

        List<NBATeam> result = teamService.getAllTeams();

        // Then
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Atlanta Hawks", result.getFirst().getFranchise());



    }

    @Test
    void getChampionTeams () {


     //given
        NBATeam nbateam1 = new NBATeam("Miami Heat", "NBA", "1988-89", "2023-24", 34, 2858,
                1505, 1353, 0.527, 16.0,
                7.0, 3.0, "MIA");

        NBATeam nbateam2 = new NBATeam("Denver Nuggets", "NBA/ABA", "1967-68", "2023-24", 57, 4586,
                2346, 2240, 0.512, 4.0,
                1.0, 1.0, "DEN");

        List<NBATeam> teamList = Arrays.asList(nbateam1, nbateam2);

        Mockito.when(teamRepository.findTeamsWithChampionships()).thenReturn(teamList);


        //when
        List<NBATeam> result = teamService.getChampionTeams();

        //then

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Miami Heat", result.get(0).getFranchise());
        assertEquals("Denver Nuggets", result.get(1).getFranchise());


        Mockito.verify(teamRepository, Mockito.times(1)).findTeamsWithChampionships();


    }

    @Test
    public void testGetConferenceWinners() {
        // Given - Mock repository response

        NBATeam nbateam1 = new NBATeam("Miami Heat", "NBA", "1988-89", "2023-24", 34, 2858,
                1505, 1353, 0.527, 16.0,
                7.0, 3.0, "MIA");

        NBATeam nbateam2 = new NBATeam("Denver Nuggets", "NBA/ABA", "1967-68", "2023-24", 57, 4586,
                2346, 2240, 0.512, 4.0,
                1.0, 1.0, "DEN");


        List<NBATeam> teamList = Arrays.asList(nbateam1, nbateam2);


        Mockito.when(teamRepository.findTeamsWithConferenceChampionships()).thenReturn(teamList);

       //when
        List<NBATeam> result = teamService.getConferenceWinners();

        // Then
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Miami Heat", result.get(0).getFranchise());
        assertEquals("Denver Nuggets", result.get(1).getFranchise());


        Mockito.verify(teamRepository, Mockito.times(1)).findTeamsWithConferenceChampionships();
    }


}
