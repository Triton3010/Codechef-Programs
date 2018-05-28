import java.util.*;
class Stones
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 {
  String s1=obj.next();
  String s2=obj.next();
  char[] c1=s1.toCharArray();
  char[] c2=s2.toCharArray();
  ArrayList<Character> a1=new ArrayList<Character>();
  ArrayList<Character> a2=new ArrayList<Character>();
  for(int i=0;i<s1.length();i++)
  { if(!a1.contains(c1[i])) { a1.add(c1[i]); } }
  for(int j=0;j<s2.length();j++)
   a2.add(c2[j]); 
  int count=0;
  for(int k=0;k<a2.size();k++)
  {
   if(a1.contains(a2.get(k)))
   { count++; }
   }
   System.out.println(count);
}}}

  