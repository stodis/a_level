package com.a_level.Lesson10.builder;

public class HouseBulderImpl implements HouseBuilder{
    private House houseTmp;
    public HouseBulderImpl(){
        houseTmp = new House();
    }


    @Override
    public House build() {
        House house = new House();
        house.setRoof(houseTmp.getRoof());
        house.setWalls(houseTmp.getWalls());
        house.setWindow(houseTmp.getWindow());
        house.setColor(houseTmp.getColor());
        house.setBottom(houseTmp.getBottom());
        return house;
    }

    @Override
    public HouseBuilder setRoof(String roof) {
        houseTmp.setRoof(roof);
        return this;

    }

    @Override
    public HouseBuilder setWalls(int walls) {
        houseTmp.setWalls(walls);
        return this;


    }

    @Override
    public HouseBuilder setBottom(String bottom) {
        houseTmp.setBottom(bottom);
        return this;
    }

    @Override
    public HouseBuilder setWindow(int window) {
        houseTmp.setWindow(window);
        return this;
    }

    @Override
    public HouseBuilder setColor(String color) {
        houseTmp.setColor(color);
        return this;
    }
}


