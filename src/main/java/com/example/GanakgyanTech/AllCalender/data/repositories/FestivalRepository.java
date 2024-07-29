package com.example.GanakgyanTech.AllCalender.data.repositories;


import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FestivalRepository extends MongoRepository<FestivalEntity,String> {

    FestivalEntity findByName(FestivalName name);

    Optional<FestivalEntity> findById(String id);
}
