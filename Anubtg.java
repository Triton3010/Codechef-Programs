import java.util.*;
class Anubtg
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt(); int sum=0;
  int[] arr=new int[a];
  for(int i=0;i<a;i++)
  {
   arr[i]=obj.nextInt();
  }
  Arrays.sort(arr);
  for(int j=arr.length-1;j>=0;)
  {
   if(j==0)
   {
   sum=sum+arr[j]; j=j-4;
   }
   else
    {
    sum+=arr[j]+arr[j-1]; j=j-4;
    }}
 System.out.println(sum);
 }}}
  
     
