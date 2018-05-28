import java.util.*;
class Name2
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  String s1=obj.next(); String s2=obj.next();
  ArrayList<Character> a1=new ArrayList<Character>();
  ArrayList<Character> a2=new ArrayList<Character>();
  char[] c1=s1.toCharArray();
  for(int i=0;i<c1.length;i++)
  {
   a1.add(c1[i]);
  }
  boolean bool=false;
  char[] c2=s2.toCharArray();
  for(int j=0;j<c2.length;j++)
  {
   a2.add(c2[j]);
  }
  if(a1.size()>a2.size())
  {
   for(int k=0;k<a2.size();k++)
    {
     if(a1.contains(a2.get(k)))
     {
      char c=a2.get(k);
      a2.remove(a2.indexOf(c)); a1.remove(a1.indexOf(c)); k--;
      if(a1.size()==0||a2.size()==0) 
       {
        bool=true; break;
       }
     }
   
  }}
  else
  {
   for(int z=0;z<a1.size();z++)
    {
     if(a2.contains(a1.get(z)))
     {
      char g=a1.get(z);
      a1.remove(a1.indexOf(g)); a2.remove(a2.indexOf(g)); z--;
    if(a1.size()==0||a2.size()==0) 
  {
    bool=true; break;
  }
     }

  }}
  
  if(bool)
  System.out.println("YES");
  else
  System.out.println("NO");

}}}