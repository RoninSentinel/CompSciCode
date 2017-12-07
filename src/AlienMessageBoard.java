import java.util.Scanner;
import java.lang.Math;
public class AlienMessageBoard {
	public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
String post = scnr.nextLine()+" ";
	int word1 = 0;
	int word2 = 0;
	int word3 = 0;
	int a;
	int b = 0;
	int c = 0;
	int d = -1;
	int e = post.length();
	String[] message = new String[e];
	for (a=0;a<e;a++) {
		char f = post.charAt(a);
		if (f == ' ') {
			b=d;
			d=a;
			message[c] = post.substring(b+1,d);
			c++;
		}
	}
	for (a=2;a<c;a++) {
		if (message[a].equals("^^"))
			word1++;
		else if ((message[a].toUpperCase()).equals("QEY"))
			word2++;
		else if (message[a].equals("$"))
			word3++;
	}
	System.out.println(" \nResults:");
	if (word1 == 0 && word2 == 0 && word3 == 0)
		System.out.print("\nClean");
		else {
			System.out.println("\nBAD");
			System.out.println(message[0]);
			System.out.println("^^: " + word1);
			System.out.println("qey: " + word2);
			System.out.println("$: " + word3);
		}
}
}