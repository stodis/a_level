package com.a_level.Lesson10.builder;

public class House {
    private String roof;
    private int walls;
    private String bottom;
    private int window;
    private String color;

    public House() {
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;

    }
    public void setWindow(int window){
        this.window = window;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", walls=" + walls +
                ", bottom='" + bottom + '\'' +
                ", window=" + window +
                ", color='" + color + '\'' +
                '}';
    }

    public String getRoof() {
        return roof;
    }

    public int getWalls() {
        return walls;
    }

    public String getBottom() {
        return bottom;
    }

    public int getWindow() {
        return window;
    }

    public String getColor() {
        return color;
    }

}
