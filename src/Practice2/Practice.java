package Practice2;
import java.util.Scanner;
public class Practice {
	  public static void main (String [] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    String [] names1 = new String [10000];
	    String [] names2 = new String [10000];
	    String [] names3 = new String [20000];
	    int a = 0;
	    int b = 0;
	    int c = 0;
	    int x = 0;
	    int y = 0;
	    int z = 0;
	  
	    System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
	    for (int i = 0; i < 10000; i++){
	     String word = scan.nextLine();
	     names1[i] = (word.substring(0,1).toUpperCase()) + (word.substring(1).toLowerCase()); //puts title case on name
	      if (names1[i].equals ("End")){
	        a = i; 
	        break;
	      }
	    }
	    for(int i = 0; i < a - 1; i++)
	        if((names1[i].compareTo (names1[i+1] ) > 0))
	          c = 1;
	          
	    System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
	    for (int i = 0; i < 10000; i++){
	     String word = scan.nextLine();
	     names2[i] = (word.substring(0,1).toUpperCase()) + (word.substring(1).toLowerCase()); 
	     if (names2[i].equals ("End")){
	       b = i;
	       break;
	     }
	    }
	    for(int i = 0; i < b - 1; i++)
	        if((names2[i].compareTo (names2[i+1] ) > 0))
	          c = 1;
	        
	    
	    if(c == 1){
	      System.out.println("First Array");
	      for (int i = 0; i < a; i++){
	        System.out.print(names1[i] + " ");
	      }
	      System.out.println();
	      System.out.println("Second Array");
	      for (int i = 0; i < b; i++){
	        System.out.print(names2[i] + " ");
	      }
	      System.out.println();
	      System.out.println("Error: Arrays not in correct order");
	      
	    }
	    
	    else if (c == 0){
	      System.out.println(a + " " + b);
	      int mergedEnd = (a + b) - 1;
	      while (x != a || y != b){
	        if((names2[y].equals("End")) || (!(names1[x].equals("End")) && (names1[x].compareTo(names2[y]) < 0))){
	              names3[z] = names1[x];
	              x++;
	              z++;
	          }
	          else{
	            names3[z] = names2[y];
	            y++;
	            z++;
	          }
	        }
	      
	      System.out.println("First Array");
	      for (int i = 0; i < a; i++){
	        System.out.print(names1[i] + " ");
	      }
	      System.out.println();
	      System.out.println("Second Array");
	      for (int i = 0; i < b; i++){
	        System.out.print(names2[i] + " ");
	      }
	      System.out.println();
	      System.out.println("Merged Array");
	      for (int i = 0; i <= mergedEnd; i++)
	        System.out.print(names3[i] + " ");
	    }
	    
	  }
	}
