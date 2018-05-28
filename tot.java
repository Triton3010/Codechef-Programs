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
  int a=obj.nextInt(); float hra; float da;
  if(a<1500)
  {
   hra=0.1*a;
   da=0.9*a;
  }
  else if(a>=1500)
  {
   hra=500;
   da=0.98*a;
  }  
  float tot=(a+hra+da);
  System.out.println(tot);
}}