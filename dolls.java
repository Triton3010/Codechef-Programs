import java.util.*;
class dolls
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt(); int arr[]=new int[a];
  for(int i=0;i<a;i++)
  { arr[i]=obj.nextInt(); }
  Arrays.sort(arr);
  for(int j=0;j<a;)
  {
   if(arr[j]!=arr[j+1])
   {
   System.out.println(arr[j]); break;
   } j=j+2;
  }
}}}
 