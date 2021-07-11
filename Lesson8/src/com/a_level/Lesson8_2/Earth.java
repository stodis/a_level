package com.a_level.Lesson8_2;

    public class Earth implements Planet{
        private String nameOfPlanet;
        private int hoursOfDay = 24;
        private float daysOfYears = 365.25f;
        private String planetType = "Terrestrial";
        private int numberOfMoon = 1;
        private float accelerationOfGravity;

        //get and set


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

        public int getHoursOfDay() {
            return hoursOfDay;
        }

        public void setHoursOfDay(int hoursOfDay) {
            this.hoursOfDay = hoursOfDay;
        }

        public float getDaysOfYears() {
            return daysOfYears;
        }

        public void setDaysOfYears(float daysOfYears) {
            this.daysOfYears = daysOfYears;
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
            System.out.println(nameOfPlanet + " has characteristics: " + hoursOfDay + " hours of day, " + daysOfYears + " days of Years");

        }
        public void showNumberMoon(){
            System.out.println(nameOfPlanet + " has number of moon: " + numberOfMoon);
        }

        public void showTypePlanet(){
            System.out.println(nameOfPlanet + "has type: " + planetType);
        }

    }
