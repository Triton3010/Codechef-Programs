import java.util.*;
class Dividing
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++)
 arr[i]=obj.nextInt();
 int sum=0; int tsum=0;
 for(int j=0;j<n;j++)
 sum+=arr[j];
 tsum=(n*(n+1))/2;
 if(sum==tsum)
 {  System.out.println("YES");  }
 else
 {  System.out.println("NO");   }
}}

 
 
 
 