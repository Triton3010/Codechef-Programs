import java.util.*;
class Codc
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt();
  int arr[]=new int[a]; int count=0;
  for(int k=0;k<a;k++)
   { int s=obj.nextInt(); if(s>=50) { count++; } else { arr[k]=s; } }
  Arrays.sort(arr);
  int len=arr.length; int l=0;
  for(int i=a-1;i>=0;i--)
  {
   for(int j=1;j<=len;j++)
    {
     if(arr[i]*j>=50)
   { l++; len=len-2; }
    }
    if(len==0)
  { break; }
}
   System.out.println(l+count);
}}}
  
    