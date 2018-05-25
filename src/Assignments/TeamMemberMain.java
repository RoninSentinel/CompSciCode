package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMemberMain {

	public class Main {
		static List<String> personNames = new ArrayList<String>();
		
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			String inputName;
				while (true) {			
				System.out.println("Enter the next name:");
				inputName = scanner.next();
				if (inputName.toLowerCase().equals("end"))
				{
				break;
				}
				else
				{
				insertionSort(titleCase(inputName));
				}
															
			}
			
			System.out.println(personNames.toString());
		}
		public static String titleCase(String name)
		{
		StringBuilder s1 = new StringBuilder(name);
		s1.replace(0, s1.length(), s1.toString().toLowerCase());
		
		s1.setCharAt(0, Character.toTitleCase(s1.charAt(0)));
		return s1.toString();
		}
		public static void insertionSort(String name)
		{
		for (int i = 0; i < personNames.size(); ++i)
		{
		String s = personNames.get(i);
		if (name.compareTo(s) <= 0)
		{
		personNames.add(i, name);
		return;
		}
		}
		personNames.add(name);
		}
	}
}
