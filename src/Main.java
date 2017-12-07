import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter ratings from the movie reviewq website.");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.println(x + "\n" + y + "\n" + z);
		System.out.println("Please enter ratings from the focus group.");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double avg1 = ((x + y +z)/3);
		double avg2 = ((a + b)/2);
		System.out.println(a + "\n" + b);
		System.out.println("Please enter the average movie critic rating.");
		System.out.println(c);
		System.out.println("Average website rating: " + avg1);
		System.out.println("Average focus group rating: " + avg2);
		System.out.println("Average movie critic rating: " + c);
		System.out.println(((avg1 *.2) + (avg2 * .3) + (c * .5))/3);
		
	}//end main	
	
	
}
		