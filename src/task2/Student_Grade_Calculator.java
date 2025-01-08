package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student_Grade_Calculator {

//	 Input: Take marks obtained (out of 100) in each subject.
//	 Calculate Total Marks: Sum up the marks obtained in all subjects.
//	 Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
//	 Grade Calculation: Assign grades based on the average percentage achieved.
//	 Display Results: Show the total marks, average percentage, and the corresponding grade to the user

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input the number of subjects
		System.out.print("Enter the number of subjects: ");
		int numberOfSubjects = sc.nextInt();

		// Array to store marks for each subject
		int[] marks = new int[numberOfSubjects];

		int totalMarks = 0;

		// Input marks for each subject

		for (int i = 0; i < numberOfSubjects; i++) {
			while (true) {
				try {

					System.out.print("Enter marks for subject " + (i + 1) + ": ");
					marks[i] = sc.nextInt();
					//System.out.println("marks Store at position " +i +" " +"in array");
					if(marks[i]>=0 && marks[i]<=100) {
					totalMarks += marks[i];
					break;
					}
					else {
						System.out.println("**** Please insert marks in-between 0 to 100 range ****");
					}

				} // try end
				catch (InputMismatchException e) {
					System.out.println("Please don't insert any type of data insted of Integer !!!");
					e.getStackTrace();
				}
			}
		}

		// Calculate average percentage
		double averagePercentage = (totalMarks / (double) (numberOfSubjects * 100)) * 100;

		// Determine the grade based on average percentage
		String grade;

		if (averagePercentage >= 90) {
			grade = "A+";
		} else if (averagePercentage >= 80) {
			grade = "A";
		} else if (averagePercentage >= 70) {
			grade = "B";
		} else if (averagePercentage >= 60) {
			grade = "C";
		} else if (averagePercentage >= 50) {
			grade = "D";
		} else {
			grade = "F";
		}

		// Display the results
		System.out.println("\n--- Results ---");
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);

		sc.close();
	}
}
