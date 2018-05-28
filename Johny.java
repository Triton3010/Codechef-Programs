import java.util.*;
class Johny
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt();
  int arr[]=new int[a];
  for(int j=0;j<a;j++)
  arr[j]=obj.nextInt();
  int index=obj.nextInt();
  int num=arr[index-1];
  Arrays.sort(arr); int found=0;
  for(int i=0;i<arr.length;i++)
  {
   if(arr[i]==num)
   {
    found=i; break;
   }}
 System.out.println(found+1);
 }}}