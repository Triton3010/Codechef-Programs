import java.util.Scanner;
class SPCandy
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  long a=obj.nextLong();
  long b=obj.nextLong();
  if(b==0)
 { System.out.println(0+" "+a); }
  else
 { System.out.println((a/b)+" "+(a%b)); }
  }}}
   