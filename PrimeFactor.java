import java.util.Scanner;
class PrimeFactor
{
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number=");
		number=sc.nextInt();

		System.out.println("Prime Factor is=");
		for(int i=2;i<=number;i++)
		{
			while(number%i==0)
			{
				number=number/i;
				System.out.print(i+"");
			}
		}
	}
}
