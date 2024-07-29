package com.example.GanakgyanTech.AllCalender;

import com.example.GanakgyanTech.AllCalender.data.domain.DynamicFestivalDetails;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import com.example.GanakgyanTech.AllCalender.data.repositories.DynamicFestivalDetialsRepository;
import com.example.GanakgyanTech.AllCalender.data.repositories.FestivalRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import java.time.DayOfWeek;
import java.time.LocalDate;

@SpringBootTest
public class DataInput {

    @Autowired
    private FestivalRepository festivalRepository;

    @Autowired
    private DynamicFestivalDetialsRepository dynamicFestivalDetialsRepository;
    @Test
    void saveData(){

//        FestivalEntity christmas = new FestivalEntity();
//        christmas.setName(FestivalName.CHRISTMAS);
//        christmas.setDate(25);
//        christmas.setMonth(12);
//        festivalRepository.save(christmas);

        DynamicFestivalDetails dynamicFestivalDetails=new DynamicFestivalDetails();
        dynamicFestivalDetails.setName(FestivalName.THANKSGIVING);
        dynamicFestivalDetails.setMonth(11);
        dynamicFestivalDetails.setWeekOfMonth(4);
        DayOfWeek day=DayOfWeek.THURSDAY;
        dynamicFestivalDetails.setDayOfWeek(day);
        dynamicFestivalDetialsRepository.save(dynamicFestivalDetails);
    }
}
