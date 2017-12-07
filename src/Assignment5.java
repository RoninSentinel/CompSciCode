import java.util.Scanner;
public class Assignment5 {
	public static void main(String[] args) {
		System.out.println("Enter the first String:");
		Scanner input1 = new Scanner(System.in);
		String x = input1.nextLine();
		System.out.println("Enter the pivot String:");
		Scanner input2 = new Scanner(System.in);
		String y = input2.nextLine();
		 int a = x.indexOf(y);
		 if (a != -1) {
			 System.out.println(x.substring(a+y.length(), x.length()) + " " + x.substring(a,a+y.length()) + " " + x.substring(0, a));
		 }
		 else {
			 System.out.println("Error: Pivot String not found.");
		 }
}
}