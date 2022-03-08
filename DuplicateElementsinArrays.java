package MapPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementsinArrays {
	
	public static void main(String[] args) {
		int arr1[] = {5,2,5,2,3,1};
		int arr2[]= {2,2,5,5,3};
		int input = 3; 
		//o/p top 3 highest element including repetition -- 1,2,2,3,5,5 -> 2,2,3,5,5
		List<Integer> l = new ArrayList<Integer>();
		//Arrays.sort(arr1);
		for(int i = 0 ; i<arr1.length;i++) {
			for(int j =0 ;j<arr2.length;j++) {
				if(arr1[j]== arr2[j]) {
					if(!l.contains(arr2[j])) {
						l.add(arr2[j]);
					}
				}
			}
		
	}
		System.out.println(l);

}}
