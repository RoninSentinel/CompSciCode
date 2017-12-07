/*Write a program that inputs a String and counts the number of words.
	Words are separated by a space or tab character. Remember ASCII codes?
			The space is character 32 and the tab is character 9.*/
package Lesson22;
import java.util.Scanner;
import java.lang.Math;
public class Lesson22DiscussionQuestion {
	 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 String x = scan.nextLine();
	 int c = 0;
	 int counter = 1
			 ;
	 while (c<x.length()) {
		 
		 if (x.charAt(c) == ' ' || x.charAt(c) == '\t' ){
			 counter++;
		 }
		 c++;
	 }
	 System.out.print(counter);
}
}
