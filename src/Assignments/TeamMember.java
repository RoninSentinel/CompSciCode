package Assignments;

public class TeamMember {
	private String fullName;
	private String idString;
	
	TeamMember(String name,String id){
		name.toUpperCase().charAt(0);
		name.toLowerCase().substring(1,name.length());
		fullName = name;
		idString = id;	
	}
	
	public String getID() {
		return idString;
	}
	
	public String toString() {
		return fullName;
	}
	public int compareTo(TeamMember other) {
		if(idString.compareTo(other.getID()) < 0) {
			return -1;
		}
		if(idString.compareTo(other.getID()) > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

