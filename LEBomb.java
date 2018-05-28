import java.util.Scanner;
class LEBomb
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n=obj.nextInt();
 while(n-->0)
 { 
  int a=obj.nextInt(); 
  String s=obj.next(); int count=0;
  char[] c=s.toCharArray();
 for(int i=1;i<=a-2;i++)
 {
   if(c[i]=='1')
   {
    c[i-1]='2'; c[i]='2';
    while(c[i+1]=='1'&&(i<a-2))
     { i++; }
   c[i+1]='2'; i++;
   }
 }  
 
 if(c[0]=='1') { c[0]='2'; c[1]='2'; }
 if(c[a-1]=='1') { c[a-1]='2'; c[a-2]='2'; }

  for(int j=0;j<a;j++)
  {
  if(c[j]=='0')
  { count++; }
  }
  System.out.println(count);
  }}}
   