import java.util.*;
class Reso
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt();
  ArrayList<Integer> a1=new ArrayList<Integer>();
  int temp=a;
  if(a%2==0)
  { 
    int count=2;
    a1.add(a); a1.add(1);
    while(count<=temp/2)
   {
      if((temp%count)==0)
     {
      int result=temp/count;
      a1.add(result);
      a1.add(count);
     }
     count+=2;
   }}
  else
  {
    int count=3;
    a1.add(a); a1.add(1);
    while(count<=temp/2)
   {
      if((temp%count)==0)
     {
      int result=temp/count;
      a1.add(result);
      a1.add(count);
     }
    count+=3;
  }}
 int min=100000000;
 for(int i=0;i<a1.size();) 
 {
  if(Math.abs(a1.get(i)-a1.get(i+1))<min)
  {
   min=Math.abs(a1.get(i)-a1.get(i+1));
  }
  i=i+2;
 }
 System.out.println(min);
 }}}
   