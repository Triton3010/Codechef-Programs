import java.util.Scanner;
class SEGM01
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  String s=obj.next();
  int count=0;
  for(int i=0;i<s.length();i++)
  {
  if(s.charAt(i)=='1')
   {
    while(i>s.length()-1&&s.charAt(i)=='1')
     {
       i++;
     }
   count++;
   }
  }
 if(count>1)
 { System.out.println("YES"); }
else
 { System.out.println("NO"); }
 }}}
