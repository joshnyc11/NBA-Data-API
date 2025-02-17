package com.jdnunoo.NBAJNProject;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.jdnunoo.NBAJNProject.AllStar.AllStar;
import com.jdnunoo.NBAJNProject.AllStarService.AllStarService;
import com.jdnunoo.NBAJNProject.AllStarController.AllStarController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

class AllStarControllerTest {

    private AllStarService allStarService;
    private AllStarController allStarController;

    @BeforeEach
    void setUp() {
        allStarService = mock(AllStarService.class);
        allStarController = new AllStarController(allStarService);
    }

    @Test
    void testGetAllStars() {
        List<AllStar> mockAllStars = Arrays.asList(
                new AllStar("Stephen Curry", "Golden State Warriors", "NBA", 2016),
                new AllStar("Kobe Bryant", "Los Angeles Lakers" , "NBA", 2008)
        );

        when(allStarService.getAllStars()).thenReturn(mockAllStars);

        List<AllStar> result = allStarController.getAllStars();

        assertEquals(2, result.size());
        assertEquals("Stephen Curry", result.get(0).getPlayer());
        verify(allStarService, times(1)).getAllStars();
    }

    @Test
    void testGetAllStarsByDecade() {
        int decade = 2000;
        List<AllStar> mockAllStars = Arrays.asList(
                new AllStar("Stephen Curry", "Golden State Warriors", "NBA", 2016),
                new AllStar("Kobe Bryant", "Los Angeles Lakers" , "NBA", 2008)
        );

        when(allStarService.getAllStarsByDecade(decade)).thenReturn(mockAllStars);

        ResponseEntity<List<AllStar>> response = allStarController.getAllStarsByDecade(decade);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().size());
        verify(allStarService, times(1)).getAllStarsByDecade(decade);
    }
}

