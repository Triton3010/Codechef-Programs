import java.util.Scanner;
class Attic
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  String s = obj.next();
  int count=0; int temp=0;
  for(int i=0;i<s.length();i++)
  {
   int occ=0;
   if(s.charAt(i)=='.')
   {
    occ++; 
   while(s.charAt(i+1)=='.')
   {
    occ++; i++;
   }
   }
   if(occ>temp) { count++; temp=occ; }
 } System.out.println(count);
}}}