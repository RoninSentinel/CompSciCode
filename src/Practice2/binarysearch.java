package Practice2;

public class binarysearch {

	class Lesson_17_Activity{
	    public static boolean isSorted(int[] a){
	        String temp = "";
	        for (i = a.size()-1;i>=0;i--){
	            if(a[i] < a[i+1]){
	                return true;
	            }
	            return false;
	        }
	    }
	    
	    public static int binarySearch(int [] a, int b){
	        int low = 0;
	        int high = a.size();
	        while(high >= low ){
	            int mid = (low + high)/2; 
	            if (b = mid){
	                return b;
	            }
	            return -1;
	        }
	        }
	    }
}
