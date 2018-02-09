package FrisbyAssignment;

public class UltimatePlayer extends Person {
	private static int jerseynumber;
	private static String position;
	
	public UltimatePlayer(String firstName, String lastName, String position){
		super(firstName,lastName);
		setPosition(position);
		if(position != "cutter") {
			System.out.println("handler");
		}
		else {
			System.out.println("cutter");
		}
		for(int i = 0; i < ArrayList<UltimatePlayer>.size();i++) {
			i = jerseynumber;
		}
	}//end constructor
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String toString() {
		return (Person(String lastname, String firstname) +"\n   Jersey #" + jerseynumber + "/n   Position: "+ position);
	}
	
}
