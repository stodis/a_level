package com.a_level.Lesson8;

public enum Week {

        MONDAY("Monday is work day "),
        TUESDAY("Tuesday is work day "),
        WEDNESDAY("Wednesday is work day "),
        THURSDAY("Thursday is work day "),
        FRIDAY("Friday is work day "),
        SATURDAY("Saturday is day off "),
        SUNDAY("Sunday is day off ");
        private String weekDay;

        Week(String weekDay) {
            this.weekDay = weekDay;

        }


        public String getWeekDay() {
            return weekDay;
        }

        public void setWeekDay(String weekDay) {
            this.weekDay = weekDay;
        }

    }
