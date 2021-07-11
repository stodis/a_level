package com.a_level.Lesson8_2;

public class Main {
    public static void main(String[] arg){

        Earth earth = new Earth();
        earth.setNameOfPlanet("Earth");
        earth.setHoursOfDay(24);
        earth.setDaysOfYears(365.25f);
        earth.setPlanetType("Terrestrial");
        earth.setNumberOfMoon(1);
        earth.setAccelerationOfGravity(9.8f);

        System.out.println("Earth");
        System.out.println();

        earth.showInfoDaysHours();
        earth.showNumberMoon();
        earth.accelerationOfGravity();

        Mercury mercury = new Mercury();
        mercury.setNameOfPlanet("Mercury");
        mercury.setEarthDay(176);
        mercury.setEarthYears(88);
        mercury.setPlanetType("Terrestrial");
        mercury.setNumberOfMoon(0);

        System.out.println("Mercury");
        System.out.println();

        mercury.setAccelerationOfGravity(3.7f);
        mercury.showInfoDaysHours();
        mercury.accelerationOfGravity();


        Venus venus = new Venus();
        venus.setNameOfPlanet("Venus");
        venus.setEarthDay(243);
        venus.setEarthYears(225);
        venus.setPlanetType("Terrestrial");
        venus.setNumberOfMoon(0);
        venus.setAccelerationOfGravity(8.87f);

        System.out.println("Venus");
        System.out.println();

        venus.showInfoDaysHours();
        venus.accelerationOfGravity();


        Jupiter jupiter = new Jupiter();
        jupiter.setNamePlanet("Jupiter");
        jupiter.setEarthDay(9.93f);
        jupiter.setEarthYears(11.86f);
        jupiter.setPlanetType("Gas Giant");
        jupiter.setNumberOfMoon(53);
        jupiter.setAccelerationOfGravity(24.8f);

        System.out.println("Jupiter");
        System.out.println();

        jupiter.showInfoDaysHours();
        jupiter.accelerationOfGravity();

        Saturn saturn = new Saturn();
        saturn.setNamePlanet("Saturn");
        saturn.setEarthDay(10.7f);
        saturn.setEarthYears(29f);
        saturn.setPlanetType("Gas Giant");
        saturn.setNumberOfMoon(53);
        saturn.setAccelerationOfGravity(10.4f);

        System.out.println("Saturn");
        System.out.println();
        saturn.showInfoDaysHours();
        saturn.accelerationOfGravity();
    }

    }

