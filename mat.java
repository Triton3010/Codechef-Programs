import java.util.Scanner;
class mat
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
 String s1=obj.next();
 String s2=obj.next();
 int min=0; int max=0;
 for(int i=0;i<s1.length();i++)
 {
  if((s1.charAt(i)!=s2.charAt(i))&&(s1.charAt(i)!='?'&&s2.charAt(i)!='?'))
  { min++; }
  }
 for(int j=0;j<s1.length();j++)
 {
  if(s1.charAt(j)=='?'||s2.charAt(j)=='?'||s1.charAt(j)!=s2.charAt(j))
  { max++;
   }
}
 System.out.println(min+" "+max);
}}}
 