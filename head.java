import java.util.Scanner;
class head
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 {
  int i;
  int n1=obj.nextInt();
  String s = obj.nextLine();  
  for(i=0;i<s.length();i++)
 {
   if(s.charAt(i)=='I')
{
   System.out.println("INDIAN");
   break;
}
   else if(s.charAt(i)=='Y')
{
   System.out.println("INDIAN");
   break;
} 
   else
{
   System.out.println("NOT SURE");
}
 }}}}
  