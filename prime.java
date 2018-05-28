import java.util.Scanner;
class prime

{
	public static void main(String ag[])
	{
		int x,i;
		boolean isprime=false;
		Scanner obj=new Scanner(System.in);
		x=obj.nextInt();
		for(i=2;i<x/2;i++)
		{
			if((x%i)==0)
			{
				isprime=true;
			}
			
		}
		if(isprime)
		{
			System.out.println("This is not a prime number");
		}
		else
		{
			System.out.println("This is a prime number");
		}
	}
}