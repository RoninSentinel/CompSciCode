package FrisbyAssignment;

import java.util.ArrayList;

public class UltimateTeam {
	ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
	ArrayList<Coach> coaches = new ArrayList<Coach>();
	
	public String getCutters() {
		for(int i = 0;i<players.size();i++) {
			if (players.get(i).getPosition() = "cutter")
				return players.get(i).Person();
		}
	}
	public String getHandlers() {
		for(int i = 0;i<players.size();i++) {
			if (players.get(i).getPosition() = "handler")
				return players.get(i).Person();
	}
	public String toString() {
		return"COACHES\n" + coaches + "\n\nPLAYERS" + players;
	}
}
