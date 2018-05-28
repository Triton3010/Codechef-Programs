import java.util.Scanner;
class Numgame2
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int a=obj.nextInt();
  if(a%4==1)
  System.out.println("ALICE");
  else
  System.out.println("BOB");
 }
  }
   }
  