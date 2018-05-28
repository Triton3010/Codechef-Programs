import java.util.*;
class RRCopy
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt();
  HashSet<Integer> hs = new HashSet<Integer>();
  for(int i=0;i<a;i++)
  hs.add(obj.nextInt());
  System.out.println(hs.size());
 }}}