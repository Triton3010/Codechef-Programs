import java.util.Scanner;
class rev
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 { 
  int count=0;
  int n1=obj.nextInt();
  int n2=n1;
  int rev=0;
  while(n2!=0)
 {
  n2=n2/10;
  count++;
 }
  int x=(int)Math.pow(10,count-1);
 while(n1!=0)
 {
  int r=n1%10;
  rev+=r*x;
  x=x/10;
  n1=n1/10;
 }
 System.out.println(rev); }
}}
  