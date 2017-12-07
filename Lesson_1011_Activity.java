import java.util.Scanner;
import java.lang.Math; 
public class Lesson_1011_Activity {
	/*
	 * Lesson 1011 Coding Activity 
	 * 
	 * For this program you will input an int to represent the octal number 
	 * and translate to the base ten number. The octal number must be 8 digits or less.
	 * 
	 * Your program should also check that all the digits are 0 - 7, then translate the 
	 * number to base ten. 
	 * 
	 * Sample Run 1: 
	 * Enter a number in base 8: 
	 * 1287 
	 * ERROR: Incorrect Octal Format 
	 * 
	 * Sample Run 2: 
	 * Enter a number in base 8: 
	 * 123 
	 * 83 
	 * 
	 * Sample Run 3: 
	 * Enter a number in base 8: 
	 * 1111111111 
	 * ERROR: Incorrect Octal Format
	 *   
	 */
	 
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter a number in base 8:");
	    	String octal = scan.nextLine();
	    	int octal2 = Integer.parseInt(new StringBuilder(octal).reverse().toString());
	    	System.out.println(octal2);
	    	int i=0;
	    	double num = 0;
	    	double x = Double.parseDouble(octal);
    		double y = i;
    		int total2 = 0;
    		int total = 0;
    		int c = octal.length()-1;

	    	for(i=0;i<=octal.length()-1;i++) {
	    		if (octal.length() > 8 || octal.charAt(i) == '8') {
	    			System.out.println("ERROR: Incorrect Octal Format");
	    		}
	    		else {
	    		num = (int)(octal2 % Math.pow(10,c-1)) * Math.pow(8,y);
	    		System.out.println(num);
	    		total =(int)num + i;
	    		total2 = (int)total;
	    		System.out.println("total = "+ total2);
	    		}
	    	c++;
	    	System.out.print(total2);
	}
	}
}
