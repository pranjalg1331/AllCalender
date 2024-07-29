package com.example.GanakgyanTech.AllCalender.data.repositories;

import com.example.GanakgyanTech.AllCalender.data.domain.DynamicFestivalDetails;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DynamicFestivalDetialsRepository extends MongoRepository<DynamicFestivalDetails,Long> {
    Optional<DynamicFestivalDetails> getByName(FestivalName name);
}
