import java.util.Scanner;
class Robot
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int row=obj.nextInt();
  int col=obj.nextInt();
  String s=obj.next();
  int r=0;  int u=0; int maxu=0; int maxr=0; int l=0; int maxl=0; int d=0; int maxd=0;
  for(int i=0;i<s.length();i++)
  {
   if(s.charAt(i)=='U')
   { u++;
   while((i<s.length()-1)&&(s.charAt(i+1)=='U'))
   {
     u++; i++;
   }
   if(u>maxu)
  { maxu=u; }
    u=0;
   }
   else if(s.charAt(i)=='D')
   { d++;
   while((i<s.length()-1)&&(s.charAt(i+1)=='D'))
   {
     d++; i++;
   }
    if(d>maxd)
    { maxd=d; }
    d=0;
   }
   
   else if(s.charAt(i)=='L')
   { l++;
   while((i<s.length()-1)&&(s.charAt(i+1)=='L'))
   {
     l++; i++;
   }
   if(l>maxl)
  { maxl=l; }
    l=0;
   }
   else if(s.charAt(i)=='R')
  { r++;
   while((i<s.length()-1)&&(s.charAt(i+1)=='R'))
   {
     r++; i++;
   }
   if(r>maxr)
  { maxr=r; }
    r=0;
   }}
  
  if((maxl<col)&&(maxr<col)&&(maxu<row)&&(maxd<row))
 {
  System.out.println("safe"); 
 }
  else
  { System.out.println("unsafe"); }
}}}

    