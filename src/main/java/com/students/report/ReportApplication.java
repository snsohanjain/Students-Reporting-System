package com.students.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ReportApplication {

	public static void main(String[] args) {

		StudentReport report = new StudentReport();
		report.addStudent("SohanJain");
		report.addStudent("Nithin");
		report.addStudent("Jayanth");
		report.addStudent("Manoj");

		report.addMarks("SohanJain",Semester.SEMESTER_1,100,77,88);
		report.addMarks("Nithin",Semester.SEMESTER_1,35,88,99);
		report.addMarks("Jayanth",Semester.SEMESTER_1,35,55,99);
		report.addMarks("Manoj",Semester.SEMESTER_1,100,77,21);


		// Report Generation
		//Average Percentage of the whole class in recant semester
		report.displayAveragePercentageRecentSemester();
		//Average marks of a students in a subject
		report.displayAverageMarksSubject("English");
		//Top 2 Consistent Student across all semester
		report.displayTopTwoConsistentStudents();


	}

}
