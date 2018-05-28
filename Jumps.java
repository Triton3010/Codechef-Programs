import java.util.Scanner;
class Jumps
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 long n= obj.nextLong();
 if(n==0||n==1)
 System.out.println("yes");
 else if(n%3==0)
 System.out.println("yes");
 else if(((n-1)%6)==0)
 System.out.println("yes");
 else
 System.out.println("no");
}}
 
 