package com.students.report;

import jakarta.persistence.*;

public class Student {

    private String name;
    private int englishMarks, mathsMarks, scienceMarks;

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(int englishMarks, int mathsMarks, int scienceMarks) {
        this.englishMarks = englishMarks;
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
    }

    public int getTotalMarks() {
        return englishMarks + mathsMarks + scienceMarks;
    }

    public String getName() {
        return name;
    }
}
