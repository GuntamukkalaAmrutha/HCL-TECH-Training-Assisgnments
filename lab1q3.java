import java.util.*;
public class lab1q3 {

	    public static void main (String[] args) {

	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number of students: ");
	        int numStudents = s.nextInt();
	        int numberGrades[] = new int[numStudents];
	        int averageGrade = 0;
	        for (int i = 1; i <= numStudents; i++) {            
	            System.out.println("Enter the grade for student"+i+ numberGrades[numStudents - i]);
	            int grade = s.nextInt();
	            averageGrade += grade;
	            if (grade < 0 || grade >100) {
	                System.out.println("Invalid grade, try again...");
	                break;
	            }
	        }
	        double average = averageGrade/numStudents;
	        System.out.println("The average is " + average);
	    }
	}

