package com.a_level.Lesson8_2;

public class Saturn implements Planet {
    private String namePlanet;
    private float earthDay = 10.7f;
    private float earthYears = 29f;
    private String planetType = "Gas Giant";
    private int numberOfMoon = 53;
    private float accelerationOfGravity;

    // get and set

    public float getAccelerationOfGravity() {
        return accelerationOfGravity;
    }

    public void setAccelerationOfGravity(float accelerationOfGravity) {
        this.accelerationOfGravity = accelerationOfGravity;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public float getEarthDay() {
        return earthDay;
    }

    public void setEarthDay(float earthDay) {
        this.earthDay = earthDay;
    }

    public float getEarthYears() {
        return earthYears;
    }

    public void setEarthYears(float earthYears) {
        this.earthYears = earthYears;
    }


    public String getPlanetType() {
        return planetType;
    }

    public void setPlanetType(String planetType) {
        this.planetType = planetType;
    }

    public int getNumberOfMoon() {
        return numberOfMoon;
    }

    public void setNumberOfMoon(int numberOfMoon) {
        this.numberOfMoon = numberOfMoon;
    }

    @Override
    public void accelerationOfGravity() {
        System.out.println(namePlanet + " has acceleration Of Gravity " + accelerationOfGravity + " m/s*2");

    }

    // methods
    public void showInfoDaysHours() {
        System.out.println(namePlanet + " has characteristics: " + earthDay + " earth days, " + earthYears + " earth years");

    }

    public void showNumberMoon(){
        System.out.println(namePlanet + "has number of moon " + numberOfMoon);
    }
    public void showTypePlanet(){
        System.out.println(namePlanet + "has type: " + planetType);
    }
}

