package MapPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopNElementsinArray {

	public static void main(String[] args) {
		/*
		 * 
		 * int n = 3; int arr []= {5,2,5,2,3,1}; List<Integer> l = new
		 * ArrayList<Integer>(); // o/p - 2,3,5 Arrays.sort(arr); //after sort -
		 * 1,2,2,3,5,5 for(int i =1;i<arr.length;i++) { if(arr[i]!=arr[i-1]) {
		 * l.add(arr[i]); } } System.out.println(l);
		 */
		 int A[]={5,2,5,2,3,1};
		    int max=0;
		    int i,j;
		    int n = 3;
		    int B[]={0,0,0};  //where n=4;
		     for(i=0;i<A.length;i++)
		       {
		         if(A[i]>max)
		          max=A[i];
		       }
		     B[0]=max;
		     for(i=1;i<n;i++){
		       max=0;
		       for(j=0;j<A.length;j++){
		         if(A[j]>max&&A[j]<B[i-1])
		            max=A[j];
		       }
		        B[i]=max;
		     }
		     
		     for(int k = 0;k<B.length;k++) {
		    	 System.out.print(B[k]);
		     }
	
	}
	
	
	  

}
