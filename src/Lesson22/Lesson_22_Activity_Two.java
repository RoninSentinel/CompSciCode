package Lesson22;

import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_Two {
    public static void main(String[] args)
     {
System.out.println("Enter a string");
Scanner scan = new Scanner(System.in);
String x = scan.nextLine();
int c = 0;

while (c<x.length()){
    System.out.println(x.charAt(c));
    c++;
    int t = 0;
    while (t < c) {
    	System.out.print("\t");
    	t++;
    }
}
}
}