import java.util.Scanner;
class CHEFZOT
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
  int a = obj.nextInt();
  int[] arr = new int[a];
  for(int i=0;i<a;i++)
  arr[i]=obj.nextInt();
  int max=0; int count=0;
  for(int j=0;j<arr.length;j++)
 {
   while(arr[j]!=0)
  {
   count++ ; j++;
   if(j==arr.length)
   { break; }
  }
 
  if(count>max)
  { max=count; }
 
  if(j<arr.length && arr[j]==0)
  {
   count=0;
  }
 }
  System.out.println(max);
}}
  
  