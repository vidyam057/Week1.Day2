package Week1.day2;

/*ClassRoom:
==========
- Create package name as week1.day2
- Create a  new class as "MyMobile" under week2.day1
- Create 2 public methods (makeCall() , sendMsg()) with simple print statement
- Create a private method payBills() with simple print statement
- Create main method
- Create object for Mobile class and call the methods using the object
- Execute the class and get the result in console
- Create a new class as MyKid in week2.day1 package
- Create an object for the previous class "MyMobile"
- Try to access all the 3 methods of class "MyMobile"
- Observe the access level of all the methods.( See if all the methods are called)*/

public class MyMobile {

	String brandName="Samsung";
	String model ="Galaxy";
	int price=40000;
	boolean isTouchScreen=true;
	byte Memory=127;
	float screenSize=7.5f;
	float amp=1.2f;
	long phoneNumber=8867513816l;
	
	public static void makeCall()
	{
		System.out.println("making a call");
	}
	
	public static void sendMsg()
	{
		System.out.println("send message");
	}
	
	public static void payBills()
	{
		System.out.println("Pay bills");
	}
	
	
	public static void main(String[] args) {
		
		MyMobile mobile1=new MyMobile();
		mobile1.payBills();
	    mobile1.sendMsg();
		int screenSize1=(int) mobile1.screenSize;
		System.out.println("screensize is " +screenSize1);
		
	}
}
