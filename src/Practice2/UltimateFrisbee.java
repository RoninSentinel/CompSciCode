package Practice2;
import java.util.Scanner;
import java.util.ArrayList;
public class UltimateFrisbee {

public class Person {
	String firstname;
	String lastname;
	public String Person(String firstname, String lastname){
}
	public String toString() {
		return (Person(lastname, firstname));
	}

public class Ultimateplayer extends Person {
	static int jerseynumber;
	String position;
	public void UltimatePlayer(String firstName, String lastName, String position){
		super.Person(lastname, firstname);
	if(position != "cutter") {
		System.out.println("handler");
	}
	else
		System.out.println("cutter");
	
	for(int i = 0; i<ArrayList<UltimatePlayer> players.size();i++) {
		i = jerseynumber;
	}
	}
	String getPosition() {
		return position;
	}
	public String toString() {
		return (Person(String lastname, String firstname) +"\n   Jersey #" + jerseynumber + "/n   Position: "+ position);
	}
	
}

public class Captain extends Ultimateplayer {
	boolean type; {
		if (type == true)
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
