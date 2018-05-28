import java.util.*;
class Buying2
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
{
 int a=obj.nextInt();
 int b=obj.nextInt();
 int[] arr=new int[a];
 for(int i=0;i<a;i++)
 arr[i]=obj.nextInt();
 Arrays.sort(arr);
 int sum=0;
 for(int j=0;j<a;j++)
 sum+=arr[j];
 int r=sum%b;
 if(sum%b==0)
 { System.out.println(sum/b); }
 else if(r>=arr[0])
 { System.out.println(-1); }
 else
 { System.out.println(sum/b); }
 }}}
 
 
 
 