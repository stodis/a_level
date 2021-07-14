package com.a_level.Lesson10.decorator;

public class AutoQAEngineer implements QA_Engineer{
    @Override
    public String makeJob() {
        return "Write java code. ";
    }

}
