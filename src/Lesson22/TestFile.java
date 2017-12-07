package Lesson22;

import java.util.Scanner;

public class TestFile {

	public TestFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] names = {"Max","Mike","Mark"};
		String [] jokes = {"Why is there a gate around cemetaries?", "What do you call an apology written in dots and dashes?","Why did the programmer quit his job?"};
		String [] punchlines = {"Because people are dying to get in.", "Remorse code.","Because he didn't get arrays."};
		System.out.println("Please select someone to tell a joke.\nYou can choose between either Max, Matt or Mark.");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		if (name.equals("Max")) {
			System.out.println(jokes[0]);
		}
		else if (name.equals("Mike")) {
			System.out.println(jokes[1]);
		}
		else if (name.equals("Mark")) {
			System.out.println(jokes[2]);
		}
		else {
			System.out.println("That was not an option.");
		}
		Scanner scnr = new Scanner(System.in);
		String answer = scnr.nextLine();
		
		if (name.equals("Max")) {
			if (answer.equals(punchlines[0])) { 
				System.out.println("Correct");
			}
			else { 
				System.out.println(punchlines[0]);
			}
		}
		if (name.equals("Mike")) {
			if (answer.equals(punchlines[1])) {
			System.out.println("Correct");
			}
			else {
				System.out.println(punchlines[1]);
			}
		}
		
		if (name.equals("Mark")) {
			if (answer.equals(punchlines[2])) {
			System.out.println("Correct");
			}
			else {
			System.out.println(punchlines[2]);
			}
		}
		
	}
}
