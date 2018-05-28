import java.util.*;
class IOPC
{
 public static void main(String[] arlen)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int a =obj.nextInt();
  int[] arr = new int[a];
  ArrayList<Integer> a1 = new ArrayList<Integer>();
  for(int i=0;i<a;i++)
 {
   int ar = obj.nextInt();
  if(!a1.contains(ar))
 {
   a1.add(ar);
 }
 }
 int max1=0; int max2=0;
 for(int j=0;j<a1.size();j++)
 {
  if(arr[j]>max1)
  {
   max1=arr[j];
  }
}
for(int k=0;k<a1.size();k++)
{
  if(arr[k]==max1)
 {
   continue;
 }
 else if(arr[k]>max2)
{
  max2=arr[k];
}}
 int ans=0;
 if(a==1)
 { System.out.println(a1.get(1)); }
 else
 {
  ans = max2%max1;
  System.out.println(ans);
 }
}}}
 
  
  
  