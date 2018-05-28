import java.util.Scanner;
class fact
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 int x=-1;
 while(n-->0)
 { 
   int a=obj.nextInt();
   if(a<10)
    System.out.println("What an obedient servant you are!");
   else
   System.out.println(x);
  }  
}}