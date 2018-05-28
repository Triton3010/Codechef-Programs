import java.util.Scanner;
class Csub
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt();
  String s=obj.next();
  long count=0;
  for(int i=0;i<a;i++)
  {
   if(s.charAt(i)=='1')
   {
    count++;
   }
  }
  long num=(count*(count+1))/2;
  System.out.println(num);
 }}}