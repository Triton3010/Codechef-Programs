import java.util.*;
class Error
{
 public static void main(String[] ar)
{
 Scanner obj=new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 {
  boolean b=false;
  String s=obj.next();
  for(int i=0;i<s.length()-2;i++)
  {
   if(s.charAt(i)=='0')
   {
    if(s.charAt(i+1)=='1')
    {
     if(s.charAt(i+2)=='0')
     {
      b=true; 
     }
     }
    }
   }
for(int j=0;j<s.length()-2;j++)
  {
   if(s.charAt(j)=='1')
   {
    if(s.charAt(j+1)=='0')
    {
     if(s.charAt(j+2)=='1')
     {
      b=true;
     }
     }
    }
   }
 if(b) { System.out.println("Good"); }
 else { System.out.println("Bad"); }
 }}}