package com.a_level.Lesson10.builder;

public interface HouseBuilder {
    House build();
    HouseBuilder setRoof(String roof);
    HouseBuilder setWalls(int walls);
    HouseBuilder setBottom(String bottom);
    HouseBuilder  setWindow(int window);
    HouseBuilder  setColor(String color);

}
