package com.example.GanakgyanTech.AllCalender.services;

import com.example.GanakgyanTech.AllCalender.data.domain.DynamicFestivalDetails;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import com.example.GanakgyanTech.AllCalender.data.repositories.DynamicFestivalDetialsRepository;
import com.example.GanakgyanTech.AllCalender.data.repositories.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Optional;

@Component("Service2")
public class FestivalService2 implements FestivalBaseService {

    @Autowired
    DynamicFestivalDetialsRepository dynamicFestivalDetialsRepository;
    @Autowired
    FestivalRepository festivalRepository;
    public FestivalEntity getDateByFestivalAndYear (FestivalName name, int year) {
        Optional<DynamicFestivalDetails> details=dynamicFestivalDetialsRepository.getByName(name);
        if(details.get()!=null){
            int month=details.get().getMonth();
            int week=details.get().getWeekOfMonth();
            DayOfWeek day=details.get().getDayOfWeek();
             LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
            LocalDate firstDay = firstDayOfMonth.with(
                    java.time.temporal.TemporalAdjusters.nextOrSame(day)
            );
            LocalDate date = firstDay.plusWeeks(week-1);
            FestivalEntity festival=new FestivalEntity(name,date.getDayOfMonth(),month);
            System.out.println(date.getDayOfMonth());
            festivalRepository.save(festival);
            return festival;
        }else{
            throw new RuntimeException("festival details not found");
        }

    }
}
