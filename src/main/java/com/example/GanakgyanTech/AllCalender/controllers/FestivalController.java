package com.example.GanakgyanTech.AllCalender.controllers;

import com.example.GanakgyanTech.AllCalender.configurations.FestivalFactory;
import com.example.GanakgyanTech.AllCalender.controllers.request.FestivalRequest;
import com.example.GanakgyanTech.AllCalender.controllers.response.FestivalResponse;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.data.domain.FestivalName;
import com.example.GanakgyanTech.AllCalender.services.FestivalBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FestivalController {

    @Autowired
    private FestivalFactory festivalFactory;
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/api/festival")
    public FestivalResponse getFestivalDate(@RequestBody FestivalRequest request) {

        FestivalName festivalName = request.getFestivalName();
        int year = request.getYear();
        FestivalBaseService service=festivalFactory.getFestivalService(request.getService());
        FestivalEntity festivalEntity=service.getDateByFestivalAndYear(request.getFestivalName(),request.getYear());
        return new FestivalResponse(festivalEntity.getDate(),festivalEntity.getMonth(),festivalEntity.getName());

    }
}
