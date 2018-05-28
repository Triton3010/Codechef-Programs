import java.math.BigInteger;
import java.util.Scanner;
class bi
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n;
 n= obj.nextInt();
 while(n-->0)
 {
  BigInteger bi = new BigInteger("1");
  int c = obj.nextInt();
  for(int i=1;i<=c;i++)
  bi=bi.multiply(BigInteger.valueOf(i));
  System.out.println(bi);
 }
}}