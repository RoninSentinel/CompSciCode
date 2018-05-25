package FrisbyAssignment;

public class Coach extends Person {
	String role;
	
	public Coach(String first, String last, String r) {
		super(first,last);
		role = r;
	}
	public String toString() {
		return(super.toString() + "\n   Role: " + role);
	}
}
