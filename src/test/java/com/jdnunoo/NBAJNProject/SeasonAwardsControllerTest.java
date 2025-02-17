package com.jdnunoo.NBAJNProject;


import com.jdnunoo.NBAJNProject.SeasonAwards.SeasonAwards;
import com.jdnunoo.NBAJNProject.SeasonAwardsController.SeasonAwardsController;
import com.jdnunoo.NBAJNProject.SeasonAwardsService.SeasonAwardsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SeasonAwardsControllerTest


{

    @Mock
    private SeasonAwardsService seasonAwardsService;

    @InjectMocks
    private SeasonAwardsController seasonAwardsController;

    private List<SeasonAwards> mockAwards;

    @BeforeEach
    void setUp() {


       mockAwards = Arrays.asList(new SeasonAwards(2024,"NBA","All-NBA","1st","Shai Gilgeous-Alexander","G",31593,
               4654,"NA","OKC",25),new SeasonAwards(2024,"NBA","All-NBA","1st","Jayson Tatum",
               "F",31593,4518
                       ,"NA","OKC",25));


    }

    @Test
    void testGetAllNBATeams() {
        when(seasonAwardsService.getAllNBATeams()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllNBATeams()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllRookieTeams() {
        when(seasonAwardsService.getAllRookieTeams()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllRookieTeams()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllNBAFirstTeam() {
        when(seasonAwardsService.getAllNBAFirstTeam()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllNBAFirstTeam()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllNBASecondTeam() {
        when(seasonAwardsService.getAllNBASecondTeam()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllNBASecondTeam()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllNBAThirdTeam() {
        when(seasonAwardsService.getAllNBAThirdTeam()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllNBAThirdTeam()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllDefenseTeams() {
        when(seasonAwardsService.getAllDefenseTeams()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllDefenseTeams()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllDefenseFirstTeam() {
        when(seasonAwardsService.getAllDefenseFirstTeam()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllDefenseFirstTeam()).isEqualTo(mockAwards);
    }

    @Test
    void testGetAllDefenseSecondTeam() {
        when(seasonAwardsService.getAllDefenseSecondTeam()).thenReturn(mockAwards);
        assertThat(seasonAwardsController.getAllDefenseSecondTeam()).isEqualTo(mockAwards);
    }
}
