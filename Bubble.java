import java.util.Scanner;

class Bubble
{
	public static void main(String args[])
	{
	int pass,size,temp;
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];

	System.out.println("Enter the no of element you want to sort=");
	size=sc.nextInt();
	
	System.out.println("Enter the elements=");
	for(int i=0;i<size;i++)
	{
	arr[i]=sc.nextInt();
	}
	
	for(pass=1;pass<size;pass++)
	for(int i=0;i<size-pass;i++)
	{
		if(arr[i]>arr[i+1])
		{
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
	
	}
	
	System.out.println("Sorted Element are=");
	for(int i=0;i<size;i++)
	{
	System.out.println(arr[i]);
	}
	
	}

}
