package com.jdnunoo.NBAJNProject.AllStarRepository;

import com.jdnunoo.NBAJNProject.AllStar.AllStar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllStarRepository extends JpaRepository <AllStar,Long> {


    @Query("SELECT a FROM AllStar a WHERE a.season >= :startYear AND a.season < :endYear ORDER BY a.season DESC")
    List<AllStar> findAllStarsByDecade(@Param("startYear") Integer startYear, @Param("endYear") Integer endYear);

}
