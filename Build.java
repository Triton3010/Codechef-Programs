import java.util.*;
class Build
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); int count=0;
  int arr[] = new int[a];
  for(int i=0;i<a;i++)
  arr[i]=obj.nextInt();
  Arrays.sort(arr);
  for(int j=0;j<a;++j)
  {
   int c=1;
   while(((j<=a-1)&&(arr[j]==arr[j+1])))
  {
   c++; j++;
  }
  if(c==2)
  { count+=2; }
  else if(c%2==0)
  {
   count+=(c*(c-1))/2;
  }
  else if(c==1||c==0)
 { count+=0; }
  else 
  {
  count+=c+1;
  }
}
  System.out.println(count);
}}}
  
   
  