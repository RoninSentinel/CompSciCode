package FrisbyAssignment;

import java.util.Scanner;
import java.util.ArrayList;
public class Captain extends UltimatePlayer {
		private boolean type;  
		
		public Captain(String first, String last, String pos, boolean t) {
			super(first,last,pos);
			type = t;
		}
		public String toString() {
			if(type==true) 
			return (super.toString() + "\n   Captain: offense");
		return(super.toString() + "\n   Captain: defense");
}
}

