package com.example.GanakgyanTech.AllCalender;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        // Define the year and month
        int year = 2024;
        int month = 9; // July

        // Get the first day of the specified month
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        // Find the first Thursday of the month
        LocalDate firstThursday = firstDayOfMonth.with(
                java.time.temporal.TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY)
        );

        // Find the second Thursday by adding 1 week to the first Thursday
        LocalDate secondThursday = firstThursday.plusWeeks(3);

        // Print the result
        System.out.println("The second Thursday of July " + year + " is: " + secondThursday);
    }
}
