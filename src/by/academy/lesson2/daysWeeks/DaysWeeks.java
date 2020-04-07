package by.academy.lesson2.daysWeeks;

import java.util.Scanner;

public class DaysWeeks {

        public static void main(String[] args) {
            Scanner scanSec = new Scanner(System.in);
            System.out.println("Введите количество секунд!");
            long totalSec = scanSec.nextLong();
            long sec;
            long totalMin;
            long min, totalHours;
            long hours;
            long totalDays;
            sec = totalSec % 60;
            totalMin = (totalSec - sec) / 60;
            min = totalMin % 60;
            totalHours = (totalMin - min) / 60;
            hours = totalHours % 24;
            totalDays = (totalHours - hours)/24;
            long days;
            days = totalDays % 7;
            long week = (totalDays - days)/7;


            System.out.println(week + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

        }
    }

