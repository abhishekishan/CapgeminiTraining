package com.sample;
import java.util.Scanner;

public class Employee
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Name");
		String empName = sc.nextLine();
		boolean res = checkName(empName);
		System.out.println("Name is "+res);
		
		System.out.println("Enter Employee Id");
		int empId = sc.nextInt();
		System.out.println("Employee-Id id "+empId);
		
		System.out.println("Enter the Employee email-id");
		String emailID = sc.nextLine();
		boolean rs = emailIDCheck(emailID);
		System.out.println("Email is "+rs);
		
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		char grade = calculateGrade(marks);
		System.out.println("Grade is "+grade);
	}
	public static boolean checkName(String empName)
	{
		if(empName.length()<10 || empName.length()>20)
		{
			return false;
		}
		return true;
	}

	public static boolean emailIDCheck(String s)
	{
		if((s.contains("1") || s.contains("2")) && (s.contains("@")))
		return true;
		else
			return false;
	}

	public static char calculateGrade(int marks)
	{
		if(marks>=60 && marks<=80)
			return 'E';
		else if(marks>=81 && marks<=90)
			return 'D';
		else if(marks>=91 && marks<=100)
			return 'A';
		else
			return 'F';	
	}
}