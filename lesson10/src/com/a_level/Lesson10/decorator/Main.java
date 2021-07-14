package com.a_level.Lesson10.decorator;

public class Main {
    public static void main(String[] args) {
        QA_Engineer qa_engineer = new AutoQAEngineer();
        QA_Engineer qa_engineers = new SeniorAutoQAEngineer(new AutoQAEngineer()); // SeniorAutoQAEngineer принимает в качестве конструктора AutoQAEngineer
        QA_Engineer qa_engineerl = new LeadAutoQAEngineer(new SeniorAutoQAEngineer(new AutoQAEngineer()));
        //LeadAutoQAEngineer принимает в качестве конструктора SeniorAutoQAEngineer, а SeniorAutoQAEngineer принимает в конструктор
        // в качестве аргумента AutoQAEngineer
        System.out.println(qa_engineer.makeJob());
        System.out.println(qa_engineers.makeJob());
        System.out.println(qa_engineerl.makeJob());
    }

}
