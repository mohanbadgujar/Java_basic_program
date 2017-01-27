import java.util.Scanner;
class Anagram
{
	public static void main(String args[])
	{
	int counter=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Please enter first string=");
	String str1=sc.nextLine();
	int l=str1.length();
	System.out.println("Please enter second string=");
	String str2=sc.nextLine();	

	for(int i=0;i<l;i++)
	{
		for(int j=0;j<l;j++)
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				counter++;
			}
		}
	}
	
	if(counter==l)
	System.out.println("Strngs are anagram strings");
	else
	System.out.println("String is not anagram");
	}
}
