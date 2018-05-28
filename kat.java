import java.util.Scanner;
class kat
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++)
 arr[i]=obj.nextInt();
 int even=0; int odd=0;
 for(int i=0;i<n;i++)
 {
  if(arr[i]%2==0)
  {
   even++;
  }
  else 
{
  odd++;
}
 }
  if(even>odd)
 { System.out.println("READY FOR BATTLE"); }
  else
  { System.out.println("NOT READY"); }
}}
  