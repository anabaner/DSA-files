package MapPrograms;


//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class ArrayReverse {
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
        int noOfElemnts =s.nextInt();
        int[] rev = new int[noOfElemnts];
        for(int i = 0;i<noOfElemnts;i++) {
        	 rev[i] =  s.nextInt();
        }
        for(int j = noOfElemnts-1;j>=0;j-- ) {
        	System.out.println(rev[j]);
        }
       

    }
}
