import java.util.Scanner;
class sum
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n,c;
 n= obj.nextInt();
 while(n-->0)
 {
 int j =obj.nextInt();
 int arr[]=new int[j];
  for(int n1=0;n1<j;n1++)
    arr[n1]=obj.nextInt();
     int a=0;
     while(a<j)
    { for(int k=2;k<arr[k]/2;k++)
     {
     if(arr[a]%k==0)
     {  c=k; break;}
     else { a++; } }
     } 
    
   