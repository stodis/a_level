package com.a_level.Lesson10.decorator;

public class SeniorAutoQAEngineer extends QA_EngineerDecorator{

    public SeniorAutoQAEngineer(QA_Engineer qa_engineer) {
        super(qa_engineer);
    }

    public String makeCodeReview(){
        return "Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

}
