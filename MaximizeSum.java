package MapPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeSum {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	        int T =s.nextInt();
	        
	        for(int m= 0 ;m<=T;m++) {
	        int A =s.nextInt();
		    int K =s.nextInt();
		    int[] arr = new int[A];
	        for(int k = 0;k<A;k++) {
	        		 arr[k] =  s.nextInt();
	        }
	        Arrays.sort(arr);
	        int sizeofSubArray =K;
	        int[] maxSubArr = new int[sizeofSubArray];
	      
	        	for (int t = K ; t>0; t--) {
	        		  for(int i = 0; i<t;i++) {
	        			  	maxSubArr[i] = arr[A- t];
	        	}
	        }
	        	
	        for(int i = 0 ; i<arr.length;i++) {
	    			for(int j =0 ;j<maxSubArr.length;j++) {
	    				if(arr[i]==maxSubArr[j]) {
	    					int size = maxSubArr.length+1;
	    					
	    				}
	    			}
	    		}
		
			 for(int k = 0;k<K;k++) { System.out.print(maxSubArr[k]+" "); }
			 
 }
	}}

/*
inputs - 
T - no of test cases  - 2 
A - length of array  - 4
K - maximum integers which we can choose  1, 2
N - array 

2
4 1
3 -1 2 5
4 2
2 1 2 5
4 2
5 2 5 2
*/

/*
 * loop 1 - 2 times and pick the top 2 elements 1 time pick the last 1 element
 */