package com.students.report;

import java.util.ArrayList;
import java.util.List;

public class StudentReport {

    private List<Student> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public void addMarks(String name,Semester semester, int englishMarks, int mathsMarks, int scienceMarks) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setMarks(englishMarks, mathsMarks, scienceMarks);
                break;
            }
        }
    }

    public void displayAveragePercentageRecentSemester() {
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getTotalMarks();
        }
        System.out.println("Average Percentage of Whole Class: " + (totalMarks / students.size()) / 3.0);
    }

    public void displayAverageMarksSubject(String subject) {
        int totalMarks = 0;
        int count = 0;
        for (Student student : students) {
            switch (subject) {
                case "English":
                    totalMarks += student.getEnglishMarks();
                    break;
                case "Maths":
                    totalMarks += student.getMathsMarks();
                    break;
                case "Science":
                    totalMarks += student.getScienceMarks();
                    break;
            }
            count++;
        }
        System.out.println("Average marks of students in " + subject + ": " + totalMarks / count);
    }

    public void displayTopTwoConsistentStudents() {
        Student[] topStudents = new Student[2];
        for (Student student : students) {
            if (topStudents[0] == null || student.getTotalMarks() > topStudents[0].getTotalMarks()) {
                topStudents[1] = topStudents[0];
                topStudents[0] = student;
            } else if (topStudents[1] == null || student.getTotalMarks() > topStudents[1].getTotalMarks()) {
                topStudents[1] = student;
            }
        }
        System.out.println("Top Two Consistent Students: " + topStudents[0].getName() + " and " + topStudents[1].getName());
    }
}
