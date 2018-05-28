import java.util.Scanner;
class PLZ
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  long l = obj.nextLong(); 
  long d = obj.nextLong(); long d1=0; long d2=0;
  long s = obj.nextLong();
  long c = obj.nextLong();
  d1=s+(c*s);  
  if(d==1)
  {
   if(s>=l)
   {
    System.out.println("ALIVE AND KICKING");
   }
   else
   {
    System.out.println("DEAD AND ROTTING");
   }
  }
  else if(d==2)
  {
   if(d1>=l)
   {
    System.out.println("ALIVE AND KICKING");
   }
   else
   {
    System.out.println("DEAD AND ROTTING");
   }
  }
  else
   {
    d2 = d1*(long)Math.pow(c+1,--d);  
   if(d2>=l)
   {
    System.out.println("ALIVE AND KICKING");
   }
   else
   {
    System.out.println("DEAD AND ROTTING");
   }
  }
 }}}  