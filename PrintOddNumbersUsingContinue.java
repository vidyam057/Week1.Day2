package Week1.day2;

public class PrintOddNumbersUsingContinue{
	
public static void main(String[] args) {
		
		int i;
		//print all Even numbers from 1 to 50
		for (i=1; i<=50;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}

