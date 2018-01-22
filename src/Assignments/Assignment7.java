package Assignments;
import java.util.Scanner;
public class Assignment7 {
	  
	   public static String duplicate(String str)
	    {
	      int x = 0;
	      String dup = "";
	     if(str.length() % 2 != 0){
	       x = str.length();
	       for(int i = 0; i < str.length(); i++){
	         for(int y = 0; y < x; y ++){
	           dup = dup + str.charAt(i);
	         }
	       }
	     }
	     if (str.length() % 2 == 0){
	       x = str.length();
	       for(int i = 0; i < str.length(); i++){
	         for(int y = 0; y < x*2; y++){
	           dup = dup + str.charAt(i);
	         }
	       }
	     }
	     
	     return dup; 
	    }
	    public static boolean isEdhesivePalindrome(String str)
	    {
	      int c = 0;
	      str = str.toUpperCase();
	      if(str.length() > 3 && str.length() < 15)
	        {
	          for (int i = 0; i < str.length(); i++){
	            if(str.charAt(i) == str.charAt(str.length()-1-i)
	            || ((str.charAt(i) == '4' || str.charAt(i) == 'A') && (str.charAt(str.length()-1-i) == 'A' || str.charAt(str.length() -1-i) == '4'))
	            || ((str.charAt(i) == '3' || str.charAt(i) == 'E') && (str.charAt(str.length()-1-i) == 'E' || str.charAt(str.length() -1-i) == '3'))
	            || ((str.charAt(i) == '0' || str.charAt(i) == 'O') && (str.charAt(str.length()-1-i) == 'O' || str.charAt(str.length() -1-i) == '0')))
	            {
	              c++;
	            }
	            }
	        }
	        if (c == str.length()) 
	        {
	        return true;
	        }
	        return false;
	      }
	    
	    public static double numberScramble (double x)
	    {
	      if(x < 0)
	      return 0.0;
	      
	      double y = x + 5.0;
	      y = y/2;
	      y = Math.sqrt(y);
	      return y;
	    }
	  
	    public static void main(String[] args)
	     {
	        Scanner scan = new Scanner(System.in); 
	        
	        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
	        String duplicate = scan.nextLine();
	        System.out.println("The duplicated String is: " + duplicate(duplicate));
	        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
	        String palindrome = scan.nextLine();
	        if(isEdhesivePalindrome(palindrome))
	          System.out.println("Nice, you found an Edhesive Palindrome!");
	        else
	          System.out.println("Too bad, that isn't an Edhesive Palindrome.");
	        System.out.println("Almost done! Please enter a number to scramble.");
	        double scramble = scan.nextDouble();
	        System.out.println("The scrambled number is: " + numberScramble(scramble));
	          
	    }
	}

