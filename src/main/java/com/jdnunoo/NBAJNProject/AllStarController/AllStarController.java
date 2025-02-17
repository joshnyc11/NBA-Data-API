package com.jdnunoo.NBAJNProject.AllStarController;

import com.jdnunoo.NBAJNProject.AllStar.AllStar;
import com.jdnunoo.NBAJNProject.AllStarService.AllStarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/all-stars")
public class AllStarController {

    private final AllStarService allStarService;

    public AllStarController (AllStarService allStarService){

        this.allStarService = allStarService;
    }

    @GetMapping
    public List<AllStar> getAllStars(){

        return allStarService.getAllStars();
    }

     @GetMapping("/by-decade")
     public ResponseEntity<List<AllStar>> getAllStarsByDecade(@RequestParam Integer decade){

        return ResponseEntity.ok(allStarService.getAllStarsByDecade(decade));
    }


}
