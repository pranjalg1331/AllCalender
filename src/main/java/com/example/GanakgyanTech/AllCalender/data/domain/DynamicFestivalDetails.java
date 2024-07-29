package com.example.GanakgyanTech.AllCalender.data.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.DayOfWeek;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "DynamicFestivalDetails", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class DynamicFestivalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Enumerated(EnumType.STRING)
    private FestivalName name;
    private int weekOfMonth;
    private int month;
    private DayOfWeek dayOfWeek;

    public DynamicFestivalDetails(int weekOfMonth,int month,DayOfWeek dayOfWeek){
        this.weekOfMonth=weekOfMonth;
        this.month=month;
        this.dayOfWeek=dayOfWeek;
    }
}
