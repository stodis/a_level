package com.a_level.Lesson10.decorator;

public class LeadAutoQAEngineer extends QA_EngineerDecorator{

    public LeadAutoQAEngineer(QA_Engineer qa_engineer) {
        super(qa_engineer);
    }

    public String sendWeekReport(){
        return "Send week report to customer. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }

}
