package Lesson17;

import java.util.Scanner;
import java.lang.Math; 

public class Lesson17Q1 {
	/*
	 * Lesson 17 Coding Activity 1
	 * Write a program that will input a list of test scores in from the keyboard. 
	 * 
	 * What do you need to be careful about when using -1 to stop a loop?
	 * 
	 *     Sample Run:
	 *         Enter the Scores:
	 *         45
	 *         100
	 *         -1
	 *
	 *         The average is: 72.5
	 * 
	 * 
	 */ 

	

	    public static void main(String[] args) {
	System.out.println("Enter the Scores:");
	int x = 0;
	int c = 0;
	int sum = 0;
	while (x != -1){
	    x=0;
	    Scanner scan = new Scanner(System.in);
	    x = scan.nextInt();
	    c++;
	    sum += x;
	}
	double avg = sum/c;
	System.out.println("The average is:" + avg);
	}
	}

