package Lesson17;

public class Lesson17Activity{
    public static boolean isSorted(int[] a){
        for(int i = 0; i<(a.length-1);i++){
            if(a[i] > a[i+1]){
                return false;
            }
            else{
                return true;
        }
            
        }
        return false;
    }
    public static int binarySearch(int[] a,int b){
         int low = 0;
         int high = a.length - 1;
         
           while(high >= low) {
             int mid = (low + high) / 2;
             if(a[mid] == b) {
                 return b;
             }
             if(a[mid] < b) {
                 low = mid + 1;
             }
             if(a[mid] > b) {
                 high = mid - 1;
             }
             
                 
             
             }
           return -1;
        }
    }
