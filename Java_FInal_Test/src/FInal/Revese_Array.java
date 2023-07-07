package FInal;

import java.util.Arrays;

public class Revese_Array {

	public static void main(String[] args) {
		  char arr[]={'f','e','y','b','m','a'};

          for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
               
                if(arr[i]>arr[j]){
                 char temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
              }
           }
        }
          System.out.println(Arrays.toString(arr));
          for(int i=0;i<arr.length;i++){
              System.out.println(arr[i]);
         }
    }
}