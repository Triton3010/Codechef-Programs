import java.util.*;
class carvans
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt(); 
 while(n-->0)
 {
   int count=1;
   int a=obj.nextInt();
   int[] arr=new int[a]; 
   for(int i=0;i<a;i++)
   {
    arr[i]=obj.nextInt();
   }
   int min=arr[0];
   for(int j=0;j<a;j++)
   {
    if(arr[j]<min)
    {
      min=arr[j]; count++;
    }}
    System.out.println(count);
 }}}
    
   
