import java.util.*;
class Lapin
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 {
  String s=obj.next();
  char[] c1=new char[s.length()/2]; char[] c2=new char[s.length()/2];
  if(s.length()%2==0)
  {
   String s1=s.substring(0,s.length()/2);
   c1=s1.toCharArray();
   String s2=s.substring(s.length()/2,s.length());
   c2=s2.toCharArray();
  }
  else
  {
   String s1=s.substring(0,s.length()/2);
   c1=s1.toCharArray();
   String s2=s.substring((s.length()/2)+1,s.length());
   c2=s2.toCharArray();
  }
   Arrays.sort(c1);
   Arrays.sort(c2);
   String s3=new String(c1);
   String s4=new String(c2);
   if(s3.equals(s4))
    { System.out.println("YES"); }
   else
   { System.out.println("NO"); }
  }}}
   
   