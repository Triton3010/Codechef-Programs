import java.util.*;
class SMARKET
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int n1=obj.nextInt();
  int q=obj.nextInt();
  int[] arr = new int[n1];
  for(int i=0;i<n1;i++) 
   arr[i]=obj.nextInt();
  for(int j=0;j<q;j++)
  {
   int c=0;
   int l=obj.nextInt();
   int r=obj.nextInt();
   int order=obj.nextInt();
   for(int k=l-1;k<r;k++)
   {
    int count=1;
    while(k<r-1&&arr[k]==arr[k+1])  
    {
     count++; k++;
    }
    if(count>=order)
    { c++; }
    }
   System.out.println(c);
   
 }}}}
   


   
    
    
   
  
