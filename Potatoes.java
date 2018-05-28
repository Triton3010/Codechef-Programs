import java.util.Scanner;
class Potatoes
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt();
  int b=obj.nextInt();
  int sum=a+b;
  int temp;
  for(int i=sum+1;;i++)
 {
  boolean bool=true;
  for(int j=2;j<=Math.sqrt(i);j++)
   {
    if(i%j==0)
    {
     bool=false; break;
    }
   }
   if(bool)
  {
    temp=i; break;
  }}
  System.out.println(temp-sum);
}}}
   