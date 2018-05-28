import java.util.*;
class rename
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt();
  ArrayList<Integer> a1=new ArrayList<Integer>();
  for(int j=1;j<=a;j++)
  a1.add(j);
  int b=obj.nextInt();
  ArrayList<Integer> a2=new ArrayList<Integer>();
  for(int i=0;i<b;i++)
  a2.add(obj.nextInt());
  for(int k=0;k<b;k++)
  {
   if(a1.contains(a2.get(k)))
    {
     a1.remove(a1.indexOf(a2.get(k))); 
     k--;
    }
  }
  for(int x=0;x<a1.size();)
  {
  System.out.print(a1.get(x)+" "); x=x+2;
  }
  System.out.println();
  for(int y=1;y<a1.size();)
  {
  System.out.print(a1.get(y)+" "); y=y+2;
  }
  }}}
   