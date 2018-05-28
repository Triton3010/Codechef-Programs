import java.util.*;
class Tachstck
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt(); int count=0;
 long d=obj.nextLong();
 long arr[]=new long[n];
 for(int i=0;i<n;i++)
 arr[i]=obj.nextLong();
 Arrays.sort(arr);
 for(int j=arr.length-1;j>=0;)
 {
  if(j==0)
  { break; }
  else
  {
  if((arr[j]-arr[j-1])<=d)
  {
   count++; j=j-2;
  }
  else
  {
   j=j-1;
  }
  }
 }
 System.out.println(count);
 }}