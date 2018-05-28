import java.util.Scanner;
class Abacus
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); 
  int k=obj.nextInt();
  long arr[] = new long[a];
  for(int i=0;i<a;i++)
  arr[i]=obj.nextLong();
  int count=a;
  for(int s=0;s<a;s++)
 {
  for(int j=s+1;j<a;j++)
  {
 
  if(((arr[s]+arr[j])%k)==0)
    {
     count--;
    }}
  }
  if(count==1)
  { System.out.println(2); }
  else if(count<=0)
  { System.out.println(0); }
  else
  { System.out.println(count); }
  }}}
  
   
  