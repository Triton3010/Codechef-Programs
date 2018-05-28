import java.util.*;
class ROWSOLD
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  String s = obj.next();
  int zero=0; long turn=0;
  for(int i=0;i<s.length();i++)
 {
  if(s.charAt(i)=='0')
  { 
   zero++;
  }}
 for(int j=0;j<s.length();j++)
 {
  if(s.charAt(j)=='1')
  {
    turn+=zero;
  }
  else if(s.charAt(j)=='0')
  {
   zero--;
  }
  if(zero==0)
 { break; }
  }
 ArrayList<Integer> a1 = new ArrayList<Integer>();
 int start=s.length()-1; int co=0;
 if(s.charAt(start)=='1')
  {
   while(start>=0&&s.charAt(start)=='1')
   {
    co++; start--;
   }
  }
  for(int k=s.length()-1-co;k>=0;k--)
  {
    int c=0;
    if(s.charAt(k)=='0')
   {
    continue;
   }
   else if(s.charAt(k)=='1')
   {
    while(k>=0&&s.charAt(k)=='1')
    {
     c++; k--;
    }
    a1.add(c);
  }
}
    for(int z=0;z<a1.size();z++)
   {
     turn=turn+(a1.get(z)*(z+1));
     }
   System.out.println(turn);
}}}
 