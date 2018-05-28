import java.util.Scanner;
class Test
{
public static void main(String[] arg)
{
int i,n,r,a;
long t;
Scanner obj = new Scanner(System.in);
n=obj.nextInt();
for(a=0;a<n;a++)
{
int c=5;
int count=0;
int k = obj.nextInt();
if(k<5)
{
System.out.println(count);
}
else
{
while(k/c>=1)
{
count=count+(k/c);
c=c*5;
}
System.out.println(count);}}
}}