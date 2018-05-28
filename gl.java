import java.util.Scanner;
class gl
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt();
  int b=obj.nextInt();
  if(a>b) { factor(a,b); }
  else { factor(b,a); }
 }
 }
static void factor(int x,int y)
{
 int g=1; int l=1;
 for(int i=1;i<y;i++)
 {
 if(x%i==0&&y%i==0)
 { g*=i; }
 }
l=g*((x/g)*(y/g));
System.out.println(g+" "+l);
}
}