package Practice2;

public class UltimateFrisbee {

public class Person {
	String firstname;
	String lastname;
	public Person(String firstname, String lastname){
	this.firstname = firstname;
}
	String toString()
		return (lastname, firstname);
	}

public class Ultimateplayer extends Person {
	static int jerseynumber;
	String position;
	UltimatePlayer(String firstName, String lastName, String position){
		super.Person();
	}
	if(postion != "cutter") {
		System.out.println("handler");
	}
	for(int i = 0; i<ArrayList<UltimatePlayer> players.size();i++) {
		i = jerseynumber;
	}
	String getPosition() {
		return position;
	}
	String toString() {
		return (Person(String lastname, String firstname) +"\n   Jersey #" + jerseynumber + "/n   Position: "+ position);
	}
	
}

public class Captain extends Ultimateplayer {
	boolean type; {
		if (type == "offense")
			return true;
		return false;
	}
	super.Captain(String firstName, String lastName, String position, boolean type){
		
	}
	String toString {
		return (Person() + "\n   Jersey #: " + jerseynumber + "\n   Position: " + position + "\n   Captain: " + type);
	}
}

public class Coach extends Person {
	String role;
	super.Captain(String firstName, String lastName, String position, boolean type){
		
	}
	String toString {
		return(Player() + "\n   Role: " + role);
	}
}

public class UltimateTeam {
	ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
	ArrayList<Coach> coaches = new ArrayList<Coach>();
	
	String getCutters() {
		for(int i = 0;i<ArrayList<UltimatePlayer> players.size();i++) {
			if (players.get(i).getPosition() = "cutter")
				return players.get(i).Person();
		}
	}
	String getHandlers() {
		for(int i = 0;i<ArrayList<UltimatePlayer> players.size();i++) {
			if (players.get(i).getPosition() = "handler")
				return players.get(i).Person();
	}
	String toString() {
		return("COACHES\n" + ArrayList<Coach> coaches) + "\n\nPLAYERS" + ArrayList<UltimatePlayer> players);
	}
}
}
