package Week1.day2;
/*  int[] arrNum = {34,23,56,78,100,1000};

 * second largest number
 * second small number
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Collections;

public class Array_demo {
	
	public static void main(String[] args) {
		
	
	int[] arrNum = {34,23,56,78,100,1000};
	
	Arrays.sort(arrNum);
	System.out.println("Largest element in array:"+arrNum[arrNum.length-1]);
	
	System.out.println("Largest element in array:"+arrNum[arrNum.length-2]);
}
}