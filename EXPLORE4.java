import java.util.*;
class EXPLORE4
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int a = obj.nextInt(); 
 int b = obj.nextInt();
 int c = obj.nextInt(); int max=0; long num=0;
 if(a<b&&a<c)
 { max = a; }
 else if(b<a&&b<c)
 { max = b; }
 else 
 { max = c; }
System.out.print(max);
for(int i=2;i<=max;i++)
 {
   if(a%i==0&&b%i==0&&c%i==0)
   {
    num = i; break;
   }
  i++;
}
 System.out.println((a*b*c)/num);
 }}
 
  
  