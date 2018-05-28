import java.util.Scanner;
class stck
{
int top,i,num;
int arr[]=new int[10];
stck()
{
	top=-1;
}

void push()
{
	System.out.println("Enter the number to be pushed in the stack:");
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	top++;
	arr[top]=num;
}
void pop()
{
	System.out.println("The number removed was"+arr[top]);
	top--;
}
void display()
{
	for(i=top;i>0;i--)
	{
				System.out.println("Status of the stack is:");

		System.out.println(arr[top]);
	}
}}


class imp
{
	public static void main(String args[])
	{

	 stck s1=new stck();
	 s1.push();
	 s1.push();
	 s1.push();
	 s1.pop();
	 s1.display();
	 
}
}