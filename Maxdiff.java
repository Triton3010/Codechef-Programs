import java.util.*;
class Maxdiff
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); int k=obj.nextInt(); int diff=a-k; int max=0;
  if(k>diff)
  {  max=k;  }
  else
  {  max=diff; }
  int sum=0; int ksum=0;
  int[] arr=new int[a];
  for(int i=0;i<a;i++)
  { arr[i]=obj.nextInt(); sum+=arr[i]; }
  Arrays.sort(arr);  
  int j=1;
  while(max-->0)
  {
   ksum+=arr[arr.length-j];
   j++;
  }
  int asum=sum-ksum;
  System.out.println(ksum-asum);
 }}}
 
  
 
  