package com.a_level.Lesson10.singletone;

public class Singleton {
    private static Singleton instance;
    Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Singleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }


}
