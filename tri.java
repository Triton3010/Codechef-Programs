import java.util.Scanner;
class tri
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 {
  double n1=obj.nextDouble();
  double n2=obj.nextDouble();
  double max=Math.sqrt((n1*n1)+(n2*n2));
  double min=Math.sqrt((n2*n2)-(n1*n1));
  System.out.println(min+" "+max);
 }
}} 