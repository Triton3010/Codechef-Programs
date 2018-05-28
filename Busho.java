import java.util.Scanner;
class Busho
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt();
  int b=obj.nextInt(); 
  int min=0; int l=1;
  if(a<b)
  { min=a; }
  else
  { min=b; }
  for(int i=2;i<min;i++)
  {
   if(a%i==0&&b%i==0)
   {
    l=i; break;
   }
   else
  {
   l=a*b;
  }}
  System.out.println((a/l-1)+" "+(b/l-1)); 
  } 
}}