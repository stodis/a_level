package com.a_level.Lesson8;
import java.util.EnumSet;
public class Main {

    public static void main(String[] args) {


                Week day1 = Week.MONDAY;
                Week day2 = Week.TUESDAY;
                Week day3 = Week.WEDNESDAY;
                Week day4 = Week.THURSDAY;
                Week day5 = Week.FRIDAY;
                Week day6 = Week.SATURDAY;
                Week day7 = Week.SUNDAY;
                for (Week week : EnumSet.allOf(Week.class)) // вывод массива
                {
                    System.out.println(week.getWeekDay());
                }
            }
        }



