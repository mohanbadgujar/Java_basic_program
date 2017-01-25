import java.util.Random;
import java.util.Scanner;
class FlipCoin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int toss;
		int head=0,tail=0,counter=0;
		System.out.println("Enter the no of time coin to be toss");
		toss=sc.nextInt();
		Random r=new Random();
		int random = r.nextInt(1);

		while(counter<toss)
		{
			if(random<0.5)
			{
				tail=tail+1;
				System.out.println("Heads"+head);
			}
			else
			{
				head=head+1;
				System.out.println("Tails"+tail);
			}
			counter++;
			random=r.nextInt(2);

		}
		System.out.println("For your tosses you got Number of head="+head+"number of tail="+tail);
	}
}
