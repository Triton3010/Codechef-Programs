import java.util.*;
class conflip
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt(); ArrayList<Integer> a1=new ArrayList<Integer>();
 while(n-->0)
 {
  
  int g=obj.nextInt();
  for(int i=0;i<g;i++)
  {
  int count=0;
  int l=obj.nextInt(); int n1=obj.nextInt(); int q=obj.nextInt();
  char[] arr=new char[n1];
  if(l==1)
  {
   for(int j=0;j<arr.length;j++)
   {
    arr[j]='H';
   }
  }
  else
  {
   for(int k=0;k<arr.length;k++)
   {
    arr[k]='T';
   }
   }
   for(int x=0;x<n1;x++)
   {
    for(int y=0;y<=x;y++)
    {
     if(arr[y]=='H')
      {
       arr[y]='T';
      }
     else if(arr[y]=='T')
      {
       arr[y]='H';
      }
    }}
   if(q==1)
  {
   for(int a=0;a<arr.length;a++)
   {
    if(arr[a]=='H')
     {
      count++;
      }

   }
  }
  else
  {
   for(int b=0;b<arr.length;b++)
   {
    if(arr[b]=='T')
   {
    count++;
   }
   }
   }
  a1.add(count);
 }}
   for(int u=0;u<a1.size();u++)
  System.out.println(a1.get(u));
}}
   
   