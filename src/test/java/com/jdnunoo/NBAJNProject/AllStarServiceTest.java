package com.jdnunoo.NBAJNProject;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import com.jdnunoo.NBAJNProject.AllStar.AllStar;
import com.jdnunoo.NBAJNProject.AllStarRepository.AllStarRepository;
import com.jdnunoo.NBAJNProject.AllStarService.AllStarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AllStarServiceTest {

    @Mock
    private AllStarRepository allStarRepository;

    @InjectMocks
    private AllStarService allStarService;

    private List<AllStar> mockAllStars;

    @BeforeEach
    void setUp() {
        mockAllStars = Arrays.asList(
                new AllStar("Stephen Curry", "Golden State Warriors", "NBA", 2016),
                new AllStar("Kobe Bryant", "Los Angeles Lakers" , "NBA", 2008)

                //String player, String team, String league, Integer season
        );
    }

    @Test
    void testGetAllStars() {
        when(allStarRepository.findAll()).thenReturn(mockAllStars);

        List<AllStar> result = allStarService.getAllStars();

        assertEquals(2, result.size());
        assertEquals("Stephen Curry", result.get(0).getPlayer());
        verify(allStarRepository, times(1)).findAll();
    }

    @Test
    void testGetAllStarsByDecade() {
        int decade = 2000;
        when(allStarRepository.findAllStarsByDecade(decade, decade + 10)).thenReturn(mockAllStars);

        List<AllStar> result = allStarService.getAllStarsByDecade(decade);

        assertEquals(2, result.size());
        verify(allStarRepository, times(1)).findAllStarsByDecade(decade, decade + 10);
    }
}

