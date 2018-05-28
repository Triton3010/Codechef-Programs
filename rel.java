import java.util.Scanner;
class rel
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt();
  int b=obj.nextInt();
  if(a>b)
  { System.out.println(">"); }
  else if(a<b)
  { System.out.println("<"); }
  else
  { System.out.println("="); }
  }}}