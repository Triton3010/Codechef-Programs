import java.util.Scanner;
class ceilab
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
  int a=obj.nextInt();
  int b=obj.nextInt();
  int c=a-b;
  String s=Integer.toString(c);
  int i=Character.getNumericValue(s.charAt(0));
  if(i>=0&&i!=9)
  {
   i++;
  }
 else
  {
    i--;
  }
 String s1=((char)(i+'0'))+s.substring(1,s.length());
 System.out.println(s1);
  }}