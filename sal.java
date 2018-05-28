import java.util.Scanner;
class sal
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); double tot;
  if(a<1500)
  {
   tot=a+(0.1*a)+(0.9*a);
  }
  else
  {
   tot=a+500+(0.98*a);
  }  
  System.out.println(String.toFormat("%0.1f",tot));
}}}