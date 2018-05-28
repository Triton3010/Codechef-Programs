import java.util.*;
import java.math.BigInteger;
class Fgf
{
  
  static long countbits(long x)
{
  long count = 0;
  while(x != 0)
  {
    count += x & 1;
    x >>= 1;
  }
  return count;
}
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    long sum=0;
    BigInteger f = new BigInteger("10000000011");
    int n = obj.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    arr[i] = obj.nextInt();
    for(int j=0;j<n;j++)
    {
     long a = arr[j]; 
     long ans = countbits(a);
     long ans1 = (long)Math.pow(ans, j+1);
     sum+= ans1;
    }
    //long mod = 10000000011;
    //long fin = sum%mod;
    String str = Long.toString(sum);
    BigInteger s = new BigInteger(str);
    BigInteger b = s.mod(f);
    System.out.print(b);
     
  }
  
}
