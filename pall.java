import java.util.Scanner;
class pall
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 { 
  int n1=obj.nextInt();
  int count=0;
  int x=n1; int num=n1; int rev=0;
  while(x!=0)
  {
   x=x/10; count++;
   }
   int a=(int)Math.pow(10,count-1);
   while(n1!=0)
  {
   int r=n1%10;
   rev+=r*a;
   n1=n1/10; a=a/10;
   }
   if(rev==num)
   { System.out.println("wins"); }
   else
   { System.out.println("losses"); }
  }}}
  