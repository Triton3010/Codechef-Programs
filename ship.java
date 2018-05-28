import java.util.Scanner;
class ship
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 char s;
 while(n-->0)
 { 
  s=obj.next().charAt(0);
  if(s=='b'||s=='B')
  System.out.println("BattleShip");
  else if(s=='c'||s=='C')
  System.out.println("Cruiser");
  else if(s=='d'||s=='D')
  System.out.println("Destroyer");
 else if(s=='f'||s=='F')
  System.out.println("Frigate");
  }}}