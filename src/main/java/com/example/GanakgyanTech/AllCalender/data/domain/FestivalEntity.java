package com.example.GanakgyanTech.AllCalender.data.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FestivalEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Enumerated(EnumType.STRING)
    private FestivalName name;
    int date;
    int month;


    public FestivalEntity(FestivalName name, int date, int month) {
        this.name=name;
        this.date=date;
        this.month=month;
    }
}

