import java.util.Scanner;
import java.util.Arrays;
class sp
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 {
  int n1=obj.nextInt();
  int arr[]=new int[n1];
   for(int i=0;i<n1;i++)
    arr[i]=obj.nextInt();
    Arrays.sort(arr);
  System.out.println(arr[0]+arr[1]);
 }
}}
    