package Practice2;
public class Dashboard {

	    private int odometer;
	    private int speedometer;
	    private String checkEngine;

	    public Dashboard() {
	        speedometer=0;
	        odometer=0;
	        checkEngine="Off";
	    }

	    public Dashboard(int o, int s) {
	    	

	        	odometer=o;
	        	speedometer=s;
	        	checkEngine="Off";

	        if(!(o>=0 && o<=99999)){
	          odometer=0;
	          checkEngine="On";
	        }
	        if(!(s>=0 && s<=100)) {
	        	  speedometer=0;
	        	  checkEngine="On";
	        }
	       
	    }
	    
	    public void accelerate() {
	      speedometer++;
	      if (speedometer > 100){
	          speedometer = 0;
	          checkEngine="On";
	      }
	    }

	    public void drive(int numMinutes) {
		      double numHours = numMinutes/60.0;
		      odometer += numHours * speedometer;
		      if (odometer > 99999){
		        odometer = 0;
		        checkEngine="On";
		      }
	      }
	    
	    
	    public String toString() {
	        //if(checkEngine.equalsIgnoreCase("Off")) {
	        //return "Speedometer: " + speedometer + " MPH" + "\nOdometer: " + String.format("%05d", odometer) + "\nCheckengine: "+checkEngine;
	    //}
	        //else {
	        		return "Speedometer: " + speedometer + " MPH" + "\nOdometer: " + String.format("%05d", odometer) + "\nCheck Engine: "+checkEngine;
	        //}
	    }

	}