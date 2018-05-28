import java.util.*;
class Horses
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); 
  long arr[]=new long[a];
  for(int i=0;i<a;i++)
  arr[i]=obj.nextLong();
  Arrays.sort(arr); long diff=1000000000;
  for(int j=1;j<arr.length;j++)
 {
  long temp=arr[j]-arr[j-1];
  if(temp<diff)
  {
   diff=temp;
  }}
 System.out.println(diff);
 }}}