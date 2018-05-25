package FrisbyAssignment;

import java.util.ArrayList;

public class UltimateTeam{
  
  private ArrayList <UltimatePlayer> players = new ArrayList<UltimatePlayer>();
  private ArrayList <Coach> coaches = new ArrayList<Coach>();
  
  UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c){
    players=p;
    coaches=c;
  }
  
  public String getCutters(){
    String ret="";
    for(UltimatePlayer u: players){
      if(u.getPosition().equals("cutter"))
        ret=ret+u.toString()+"\n";
    }
    return ret;
  }
  
  public String getHandlers(){
    String ret="";
    for(UltimatePlayer u: players){
      if(u.getPosition().equals("handler"))
        ret=ret+u.toString()+"\n";
    }
    return ret;
  }
  
  public String toString(){
    String ret="COACHES\n";
    for(Coach c: coaches)
      ret=ret+c.toString()+"\n";
    ret=ret+"\nPLAYERS\n";
    for(UltimatePlayer u: players)
      ret=ret+u.toString()+"\n";
    return ret;
  }
}