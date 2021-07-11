package com.a_level.Lesson8_2;

public class Mercury implements Planet{
    private String nameOfPlanet;
    private int earthDay = 176;
    private float earthYears = 88;
    private String planetType = "Terrestrial";
    private int numberOfMoon = 0;
    private float accelerationOfGravity;

    // get and set


    public float getAccelerationOfGravity() {
        return accelerationOfGravity;
    }

    public void setAccelerationOfGravity(float accelerationOfGravity) {
        this.accelerationOfGravity = accelerationOfGravity;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public void setNameOfPlanet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }

    public int getEarthDay() {
        return earthDay;
    }

    public void setEarthDay(int earthDay) {
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
        System.out.println(nameOfPlanet + " has acceleration Of Gravity " + accelerationOfGravity + " m/s*2");

    }

    // methods

    public void showInfoDaysHours() {
        System.out.println(nameOfPlanet + " has characteristics: " + earthDay + " earth days, " + earthYears + " earth years");

    }
    public void showNumberMoon(){
        System.out.println(nameOfPlanet + "has number of moon " + numberOfMoon);
    }
    public void showTypePlanet(){
        System.out.println(nameOfPlanet + "has type: " + planetType);
    }
}
