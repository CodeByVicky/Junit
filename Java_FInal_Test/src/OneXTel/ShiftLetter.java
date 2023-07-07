package OneXTel;


import java.util.TreeSet;

public class ShiftLetter{
    public static void main(String args[]){  

              int arr1[]={1,101,5,8,9};
              int arr2[]={10,11,111,7,2};
              int a=0;
              int b=0;
               
              TreeSet<Integer> et=new TreeSet<Integer>();
        
              for(int i=0;i<arr1.length+arr2.length;i++) {
            	  et.add(arr1[a]);
            	  i++;
            	  a++;
            	  et.add(arr2[b]);
            	  b++;
              }
              System.out.println(et);
           
    	    }
    	
     }
  