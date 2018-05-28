import java.util.*;
class MONDICT
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 { 
  String s= obj.next();
  HashSet<Character> set=new HashSet<Character>();
  char[] c=s.toCharArray();
  for(int i=0i<c.length;i++)
  {
   set.add(c[i])
  