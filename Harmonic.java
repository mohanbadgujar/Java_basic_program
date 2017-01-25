import java.util.Scanner;
class Harmonic 
{
	public static void main(String args[])
	{
		double value=0;
		Scanner sc=new Scanner(System.in);
		int i; 
		System.out.println("Enter the N harmonic value=");
		int n=sc.nextInt();
		
		if(n==0)
		System.out.println("Please enter value morethan 0");
		else
		{
			for(i=1;i<=n;i++)
			{	
			
				value = value+(1.0f/i);
			}
			System.out.println("harmonic value is"+value);
		}
	}
}
