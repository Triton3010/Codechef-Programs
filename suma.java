import java.util.Scanner;
class suma
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  String s=obj.next();
  int sum=0;
  for(int i=0;i<s.length();i++)
  {
   if(Character.getNumericValue(s.charAt(i))>=0&&Character.getNumericValue(s.charAt(i))<=9)
   {
    sum+=Character.getNumericValue(s.charAt(i));
    }}
  System.out.println(sum);  
}}}
