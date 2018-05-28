import java.util.Scanner;
class pal
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); 
  int b=obj.nextInt(); int sum=0;
  for(int i=a;i<=b;i++)
  { 
    int count=0; int n1=i; int c=i; int ch=i;
    while(ch!=0)
   {
      ch=ch/10;
      count++;
   }
    int ten=(int)Math.pow(10,count-1); int num=0;
    while(n1!=0)
   {
    int r=n1%10;
    num+=r*ten; ten=ten/10;
    n1=n1/10;
  }
  if(c==num)
  {
  sum+=c;
  }
}
  System.out.println(sum);
}}}