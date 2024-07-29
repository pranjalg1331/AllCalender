package com.example.GanakgyanTech.AllCalender.controllers.response;

import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FestivalResponse {
    private int date;
    private int month;
    private FestivalName name;
}
