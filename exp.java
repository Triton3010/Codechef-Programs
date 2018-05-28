import java.util.Scanner;
class exp
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int qty=obj.nextInt();
  int price=obj.nextInt();
  double tot=qty*price;
  if(qty>1000)
  tot=tot*0.9;
  System.out.println(String.format("%.6f", tot));
 }
 }}