package com.utm;

public class Exams {
    private int examId;
    private String examName;
    private String examDate;
    private int examGrade;

    public Exams(int examId, String examName, String examDate, int examGrade) {
        this.examId = examId;
        this.examName = examName;
        this.examDate = examDate;
        this.examGrade = examGrade;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public int getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(int examGrade) {
        this.examGrade = examGrade;
    }
}
