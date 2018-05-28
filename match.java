import java.util.Scanner;
class match
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  String s1=obj.next(); 
  String s2=obj.next();
  boolean b=true;
  for(int i=0;i<s1.length();i++)
  {
  if(s1.charAt(i)==s2.charAt(i)||s1.charAt(i)=='?'||s2.charAt(i)=='?')
  {
      b=true;
  }
  else
  {
     b=false; break;
  }
  }
  if(b)
  { System.out.println("Yes"); }
  else
   {    System.out.println("No"); }
  }}}
 