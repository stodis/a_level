package com.a_level.Lesson10.builder;

public class HouseBuilderDirector {
    private HouseBuilder builder;
    public HouseBuilderDirector (HouseBuilder builder){
        this.builder = builder;
    }

    public House construct(){
        return builder.setRoof("Red roof").setWalls(8).setWindow(6).setBottom("bottom 1").setColor("White color").build();
    }

    public static void main(String[] arg){
        HouseBuilder builder = new HouseBulderImpl();
        HouseBuilderDirector houseBuilderDirector = new HouseBuilderDirector(builder);
        System.out.println(houseBuilderDirector.construct());
    }

}
