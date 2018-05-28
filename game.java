import java.util.*;
import java.math.BigInteger;
class game
{
	public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
	ArrayList<Long> a1 = new ArrayList<Long>();
	long n = obj.nextLong();
	long sum = 0;
	long sum1 = 0;
	long ans;
	for(long i=0;i<n;i++)
	{
		long a = obj.nextLong();
		sum1 += a;
		a1.add(a);
	}
	Collections.sort(a1);
	while(a1.size()>0)
	{
	sum += a1.get(0); 
	while(a1.contains(a1.get(0)+1))
	{
	a1.remove(a1.indexOf(a1.get(0)+1));
    }

	a1.remove(0);

}
if((sum1-sum)>sum)
{
  ans = sum1-sum;
  System.out.println(ans);
}
else
{
   System.out.println(sum);
}

}
}