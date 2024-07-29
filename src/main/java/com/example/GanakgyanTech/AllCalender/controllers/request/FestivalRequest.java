package com.example.GanakgyanTech.AllCalender.controllers.request;

import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FestivalRequest {

    private FestivalName festivalName;
    private int year;
    private String service;

    // Getters and Setters

}