package CastilloA;
import java.util.Scanner;
/**
 * Alfonso Castillo
 * HW #8, Summer 2018
 * This code test sorting algorithms.
 * Methods that I created were quickSort2.
 */

public class HW8{
	
//had to package sort and HW8 in order to access the methods in Sort.
//Could not extend Sort, because it was a final class, thus had to package.	
	
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int N = input.nextInt();
		Integer [] a = new Integer [N];
		Integer [] b = new Integer [N];
		Integer [] c = new Integer [N];
		
		//random array of integers
		for(int i = 0; i <= a.length-1; i++){
        	a[i] = (int) (Math.random() * 100);
		}
		//ascending order of integers
	    for(int j = 0; j <= b.length - 1; j++) {
	    	b[j] = j;
	   }
	    //descending order of integers.
	    for(int k = (N-1); k >= 0; k--){
	    	c[(N-1)-k] = k;
	    }
	    
		//times my algorithm
		System.out.println("Time of Algorithm");
		long then = System.currentTimeMillis();
		Sort.mergeSort(c);
		long elapsedTime = System.currentTimeMillis() - then;
		System.out.println("Elapsed time for algorithm: " + elapsedTime);
		
	  

       input.close();
	    }
	
	}





		

