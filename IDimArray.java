import java.util.*;
import java.util.stream.*;
public class IDimArray {
	public static void main(String args[]) {
		//static array
		//declare int array size of any
		int i [] = new int[5];
		//initialize array variables
		i[0]=1; i[1]=2; i[2]=3; i[3]=4; i[4]=5;
		
		//dynamic array declaration and initialisation of any size
		int [] j = {5,2,4,1,3};
		
		//accessing values from the arrays
		//print the array values using length and index
		int len1=i.length;
		for(int k=0; k<len1-1; k++) {
			System.out.print(i[k] + " ");
		}
		System.out.println();
		
		//print the array values using for each-loop
		for(int k:j){
			System.out.print(k+" ");
		}
		System.out.println();
		
		// Skip index 2 and print the rest of the values of the array
        for (int k = 0; k < i.length; k++) {
            if (k == 2) continue; 
            System.out.print(i[k] + " ");
        }
		System.out.println();
		
		//print the reverse of array
		for (int k = len1 - 1; k >= 0; k--) {
			System.out.print(i[k] + " ");
		}			
		System.out.println();
		
		//printing array using streams
		Arrays.stream(j).sorted.forEach(System.out::println);
	}
}