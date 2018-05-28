import java.util.Scanner;
class Luckystr
{
 public static void main(String[] ar)
{
 Scanner obj=new Scanner(System.in);
  int a=obj.nextInt();
  int b=obj.nextInt();
  String[] str=new String[a];
  for(int i=0;i<a;i++)
  str[i]=obj.next();
  for(int j=0;j<b;j++)
  {
   boolean bool=false;
   String s=obj.next();
    if(s.length()>=47)
     { bool=true; }
   for(int k=0;k<a;k++)
   {
    if(s.contains(str[k]))
    {
      bool=true; break;
    }
   }
   if(bool)
   { System.out.println("Good"); }
   else
   { System.out.println("Bad"); }
}}}
  

     
   