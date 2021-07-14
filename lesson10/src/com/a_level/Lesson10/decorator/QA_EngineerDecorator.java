package com.a_level.Lesson10.decorator;

public class QA_EngineerDecorator implements QA_Engineer{
    QA_Engineer qa_engineer; // экзкмпляр QA_Engineer

    public QA_EngineerDecorator(QA_Engineer qa_engineer) {
        this.qa_engineer = qa_engineer;
    }

    @Override
    public String makeJob() {
        return qa_engineer.makeJob();
    }


}
