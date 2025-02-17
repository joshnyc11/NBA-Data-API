package com.jdnunoo.NBAJNProject.AllStarService;

import com.jdnunoo.NBAJNProject.AllStar.AllStar;
import com.jdnunoo.NBAJNProject.AllStarRepository.AllStarRepository;
import com.jdnunoo.NBAJNProject.Team.NBATeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AllStarService {

    public final AllStarRepository allStarRepository;

    @Autowired
     public AllStarService (AllStarRepository allStarRepository){

        this.allStarRepository = allStarRepository;
    }


    public List<AllStar> getAllStars(){

        return allStarRepository.findAll();
    }


    public List <AllStar> getAllStarsByDecade(Integer decade) {
        int startYear = decade;
        int endYear = decade + 10;
        return allStarRepository.findAllStarsByDecade(startYear, endYear);
    }

}
