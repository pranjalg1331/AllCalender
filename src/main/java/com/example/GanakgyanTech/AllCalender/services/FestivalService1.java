package com.example.GanakgyanTech.AllCalender.services;

import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import com.example.GanakgyanTech.AllCalender.data.repositories.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Service1")
public class FestivalService1 implements FestivalBaseService{

    @Autowired
    private FestivalRepository festivalRepository;


    public FestivalEntity getDateByFestivalAndYear(FestivalName name, int year) {
        return festivalRepository.findByName(name);
    }
}
