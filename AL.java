import java.util.*;
class AL
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 {
  long a=obj.nextLong();
  long b=obj.nextLong();
  long k=obj.nextLong();
  long count=0;  long num=-1;
   for(long i=a;i<=b;i++)
   {
    ArrayList<Long> al = new ArrayList<Long>();
    long x=i;
    while(x!=0)
   {
    long temp=x%10;
    if(!al.contains(temp)&&(temp%2!=0))
    {
     al.add(temp);
    }
    else if(temp%2==0)
    {
      al.clear(); break;
    }
    x=x/10;
   }
    if(al.size()==0)
    continue;

   for(int y=0;y<al.size();y++)
   {
     if(i%al.get(y)==0)
    { 
     break;
    }
     else if(y==al.size()-1)
    {
     count++;
    }
   }
     if(count==k)
    { num=i; break; }
   }
System.out.print(num);
}}}    
    