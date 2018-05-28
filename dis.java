import java.util.Scanner;
class dis
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 {
   int a=obj.nextInt();
   int b=obj.nextInt();
   int c=obj.nextInt();
   if((a>b&&a<c)||(a>c&&a<b))
   System.out.println(a);
   else if((b>a&&b<c)||(b>c&&b<a))
   System.out.println(b);
   else
   System.out.println(c);
  }  
}}