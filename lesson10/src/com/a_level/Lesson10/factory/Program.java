package com.a_level.Lesson10.factory;

public class Program {
    public static void main(String[] arg) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        DeveloperFactory developerFactory1 = new CppDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        Developer developer1 = developerFactory1.createDeveloper();
        developer1.writeCode();
        developer.writeCode();
    }



}
