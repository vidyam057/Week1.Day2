package Week1.day2;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int[] arr1= { 1,2,2,3,17,3,10,5,16,17};
		int i, j;

		System.out.println("Duplicate Numbers are");
		for (i = 0; i <arr1.length; i++) {

			for (j = i + 1; j <arr1.length; j++) {
				if (arr1[i] == arr1[j]) 
					System.out.println(arr1[j]);
			}
		}
	}// main
}// class
