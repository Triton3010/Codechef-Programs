import java.util.Scanner;
class Anuwta
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 long n = obj.nextLong();
 while(n-->0)
 {
  long a = obj.nextLong();
  long b = ((a*(a+1))/2)+a;
  System.out.println(b);
 }}}