package Dashboard;

	public class Dashboard implements Comparable{
	    private int odometer;
	    private int speedometer;
	    private boolean checkEngine;
	    public Dashboard() {
	      this(0,0);
	    }
	    public Dashboard(int o, int s) {
	      int check =0;
	      if(o>=0 && o<=99999)
	        odometer=o;
	      else{
	        odometer=0;
	        check=1;
	      }
	      if(s>=0 && s<=100)
	        speedometer = s;
	      else{
	        speedometer=0;
	        check =1;
	      }
	      if(check==0)
	        checkEngine=false;
	      else
	        checkEngine=true;
	    }
	    public String toString() {
	      String n = odometer+"";
	      while(n.length()<5)
	        n="0"+n;
	      if(checkEngine==true)
	        return "Speedometer: " + speedometer + " MPH\nOdometer: " + n+ "\nCheck Engine: On";
	      return "Speedometer: " + speedometer + " MPH\nOdometer: " + n+ "\nCheck Engine: Off";
	    }
	    public void accelerate() {
	      speedometer+=1;
	      if(speedometer>100){
	        speedometer=0;
	        checkEngine=true;
	      }
	    }
	    public void drive(int n) {
	      odometer+= speedometer*n/60;
	      if(odometer>99999){
	        odometer=0;
	        checkEngine=true;
	      }
	    }
	    public int compareTo(Object x){
	      Dashboard temp = (Dashboard) x;
	      if(odometer >temp.odometer)
	        return 1;
	      if(odometer==temp.odometer){
	        if(speedometer>temp.speedometer)
	          return 1;
	        if(speedometer==temp.speedometer){
	          if(checkEngine==false && temp.checkEngine!=false)
	            return -1;
	          if(checkEngine==temp.checkEngine)
	            return 0;
	          return 1;
	        }
	        return -1;
	      }
	      return -1;
	    }
	    public String race(Dashboard x, int y, int z){
	      String ret="";
	      int a=0;
	      int b=0;
	      for(int i=0;i<y;i++){
	        if(speedometer==100){
	          accelerate();
	          a=1;
	          break;
	        }
	        else
	          accelerate();
	      }
	      for(int i=0;i<z;i++){
	        if(x.speedometer==100){
	          x.accelerate();
	          b=1;
	          break;
	        }
	        else
	          x.accelerate();
	      }
	      if(a==1)
	        ret=ret+ "First car stalled out!\n";
	      if(b==1)
	        ret=ret+ "Second car stalled out!\n";
	      ret=ret+"\n"+toString()+"\n\n"+x.toString()+"\n\n";
	      if(a==1&&b==0)
	        ret=ret+"Car 2 has won the race!";
	      else if(a==0&&b==1)
	        ret=ret+"Car 1 has won the race!";
	      else if(a==1&&b==1)
	        ret=ret+"It's a tie!";
	      else if(a==0&&b==0){
	        if(speedometer>x.speedometer)
	          ret=ret+"Car 1 has won the race!";
	        else if(speedometer<x.speedometer)
	          ret=ret+"Car 2 has won the race!";
	        else
	          ret=ret+"It's a tie!";
	      }
	      return ret;
	    }
	    public String difference(Dashboard x){
	      String ret="";
	      if(odometer>=x.odometer)
	        ret="Second car will need to drive for " +(int)((double)(odometer-x.odometer)/x.speedometer*60)+" minutes to catch first car.";
	      else if(x.odometer>odometer)
	        ret="First car will need to drive for " +(int)((double)(x.odometer-odometer)/speedometer*60)+" minutes to catch second car.";
	      return ret;
	    }
	}	
	


