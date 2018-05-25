package FrisbyAssignment;
import java.util.ArrayList;

public class UltimatePlayer extends Person {
	private static int c = 1;
	private String position;
	private int jerseynumber;
	public UltimatePlayer(String firstName, String lastName, String pos){
		super(firstName,lastName);
		if(pos.equals("handler") || pos.equals("cutter")) {
			position = pos;
		}
		else {
			position = "handler";
		}
		jerseynumber = c;
		c++;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String toString() {
		return super.toString()+"\n   Jersey #: " + jerseynumber + "\n   Position: "+ position;
	}
	
}