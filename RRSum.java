import java.util.*;
class RRSum
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
  long a=obj.nextLong();
  long b=obj.nextLong();
  long low = 1+(a+1);
  long high = a + (2*a); long mid=(low+high)/2;
  for(long i=0;i<b;i++)
  {
   long c=obj.nextLong();
   if(c>=low&&c<=high)
  {
   if(c>=low&&c<=mid)
   {
    System.out.println(c-low+1);
   }
   else
   {
    System.out.println(high-c+1);
   }
  }
  else
  {
   System.out.println(0);
  }}
 }}
 
 