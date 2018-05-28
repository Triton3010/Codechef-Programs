import java.util.Scanner;
class fact2
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
byte n,i,j;
n=obj.nextByte();
for(i=0;i<n;i++)
{
byte f = obj.nextByte();
long fact=1;
for(j=1;j<=f;j++)
 fact=fact*j;
 System.out.println(fact);
 }}}