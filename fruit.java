import java.util.Scanner;
class fruit
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 for(int i=0;i<n;i++)
 {
 int n1=obj.nextInt();
 int m=obj.nextInt();
 int k=obj.nextInt();
 int min; int max;
 if(n1<m)
{ min=n1; max=m; }
 else
{ min=m; max=n1; }
 while(k>0&&min!=max)
{
 k--;
 min++;
 }
if(k!=0&&k%2==0)
{
System.out.println("0");
}
else if(k==0)
{
 System.out.println(max-min);
}
else if(min==max)
{ System.out.println(k%2); }

}}}
 