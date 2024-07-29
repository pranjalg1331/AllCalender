package com.example.GanakgyanTech.AllCalender.services;

import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;

public interface FestivalBaseService {
    FestivalEntity getDateByFestivalAndYear(FestivalName name, int year);
}
