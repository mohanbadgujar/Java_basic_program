import java.util.Scanner;
class UserName
{
        public static void main(String args[])
        {
		String arr="";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter user name");
                String username=sc.next();
		String input = "Hello <<UserName>>,How are you?";
		System.out.println("Before:"+input);
                int length=username.length();
                if(length>=3)
			{
				 arr=input.replace("<<UserName>>",username);
			}
               System.out.println("After:"+arr);
        }
} 

