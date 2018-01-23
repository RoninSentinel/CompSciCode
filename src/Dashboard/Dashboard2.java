package Dashboard;

public class Dashboard2 {
	private int odometer;
    private int speedometer;
    private boolean checkEngine;

    public Dashboard2() {
        speedometer=0;
        odometer=0;
        checkEngine=false;
    }
    public static void main(String []args) {
    	
    }
    public Dashboard2(int o, int s) {
        if (o>=0 && o<=99999)
        		odometer=o;
        else {
          odometer=0;
          checkEngine=true;
        }
        if (s>=0 && s<=100)
        		speedometer=s;
        else {
         speedometer=0;
         checkEngine=true;
        }
    }

    public void accelerate() {
      speedometer++;
      if (speedometer > 100){
          speedometer = 0;
          checkEngine = true;
      }
    }

    public void drive(int numMinutes) {
      double numHours = numMinutes/60.0;
      odometer += numHours * speedometer;
      if (odometer > 99999){
        odometer = 0;
        checkEngine = true;
      }
    }
    
    public String toString() {
        if(checkEngine == false) {
        return ("Speedometer: " + speedometer + " MPH" + "\nOdometer: " + String.format("%05d", odometer) + "\nCheckengine: " + checkEngine);
    }
        else {
        		return "";
        }
    }
}
