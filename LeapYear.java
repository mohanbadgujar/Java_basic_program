import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year=");
		int year=sc.nextInt();
		int length = (int) (Math.log10(year) + 1);
		System.out.println(length);
		if(length==4)
		{
			if(year%4==0)// && year%100!=0 ||year%400==0)
				System.out.println("Year is leap year");
			else
				System.out.println("Year is not leap year");
		}else
			System.out.println("Please enter 4 digit number");
	}

}
