import java.util.Scanner;
class Cod
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt(); int sum=0;
  int[] arr=new int[100000];
  for(int i=0;i<a;i++)
   {
    arr[obj.nextInt()]++;
   } 
  for(int j=0;j<arr.length;j++)
  {
   if(arr[j]!=0)
   {
    sum+=arr[j]*(arr[j]-1);
   }
  }
  System.out.println(sum);
}}}