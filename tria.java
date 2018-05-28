import java.util.Scanner;
class tria
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  boolean b=true;
  int a=obj.nextInt();
  for(int i=2;i<=Math.sqrt(a);i++)
   {
    if(a%i==0)
   { b=false; break; }
    }
   if(b||a==2||a==3)
   { System.out.println("yes"); }
   else
   { System.out.println("no"); }
  }}}