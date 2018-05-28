import java.util.Scanner;
class Walk
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 long n= obj.nextLong();
 while(n-->0)
 { 
  int a = obj.nextInt();
  long[] arr = new long[a];
  long max=0; int index=0;
  for(int i=0;i<arr.length;i++)
  {
   long c = obj.nextLong();
   arr[i] = c;
   if(c>=max)
   {
    max=c; index=i;
   }
  }
  long l = max+index;
  System.out.println(l);
 }}}
 