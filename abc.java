import java.util.Scanner;
class abc
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n,lead=0,win=1;
 n= obj.nextInt();
 while(n-->0)
 {
 int n1=obj.nextInt();
 int n2=obj.nextInt();
 if(n1>n2&&n1-n2>lead)
 { lead= n1-n2; win=1;
 }
 else if(n2>n1&&n2-n1>lead)
 {
 lead = n2-n1; win=2;
 }
 
 } System.out.println(win+" "+lead);
  }} 