import java.util.Scanner;
class PRGIFT
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 long n= obj.nextLong();
 while(n-->0)
 {
  int a = obj.nextInt();
  int k = obj.nextInt();
  int[] arr = new int[a];
  for(int j=0;j<a;j++)
  arr[j]=obj.nextInt();
  int count=0;
  for(int i=0;i<a;i++)
 {
  if(arr[i]%2==0)
  { count++; }
 } 
  if(k==0)
  { 
    if(count>0)
   {
    System.out.println("NO");
   }
   else
  { System.out.println("YES"); }
   }
  else if(count>=k)
  { System.out.println("YES"); }
  else
  { System.out.println("NO"); }
  }}}
