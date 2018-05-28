import java.util.Scanner;
class cake
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  String s1=obj.next();
  char a=s1.charAt(0); 
  int ca=0; int cb=0; int cc=0; int max; char b=0;
  for(int i=0;i<s1.length();i++)
  {
   if(s1.charAt(i)==a)
   {
    ca++;
   }
  }
  for(int j=0;j<s1.length();)
  {
   if(s1.charAt(j)==a)
  {
     j++;
  }
  else
{
   b=s1.charAt(j); break;
}
  }
for(int k=0;k<s1.length();k++)
  {
   if(s1.charAt(k)==b)
   {
    cb++;
   }
  }
 cc=s1.length()-(ca+cb);
 if(ca==(cb+cc))
 { System.out.println("YES"); }
 else if(cb==(ca+cc))
 { System.out.println("YES"); }
 else if(cc==(ca+cb))
 { System.out.println("YES"); } 
 else             
 { System.out.println("NO"); }
}}}