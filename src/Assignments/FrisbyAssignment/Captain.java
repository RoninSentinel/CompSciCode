package FrisbyAssignment;

import java.util.Scanner;
import java.util.ArrayList;
public class Captain  extends Ultimateplayer {
		private boolean type = false;  
		
		public Captain(){
		super.Captain(String firstName, String lastName, String position, boolean type);
			
		}
		public String toString() {
			return (Person() + "\n   Jersey #: " + jerseynumber + "\n   Position: " + position + "\n   Captain: " + type);
		}
}//end Captain Class

