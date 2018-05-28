import java.util.*;
class KBIGNUMB
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  long a = obj.nextLong();
  long n1 = obj.nextLong();
  long m = obj.nextLong();
  String s = Long.toString(a);
  StringBuilder b = new StringBuilder();
  for(long i=0;i<=n1;i++)
   { b.append(s); } 
   Long new = Long.parseLong(b);
   Long ans = new%m ;
   System.out.println(ans);
  }}}