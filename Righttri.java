import java.util.Scanner;
class Righttri
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt(); int count=0;
 while(n-->0)
 {
  int x1=obj.nextInt();
  int y1=obj.nextInt();
  int x2=obj.nextInt();
  int y2=obj.nextInt();
  int x3=obj.nextInt();
  int y3=obj.nextInt();
  double d1=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
  double d2=Math.sqrt(Math.pow(Math.abs(x3-x1),2)+Math.pow(Math.abs(y3-y1),2));
  double d3=Math.sqrt(Math.pow(Math.abs(x3-x2),2)+Math.pow(Math.abs(y3-y2),2));
  double min; double mid; double max;
  if(d1>d2&&d1>d3)
  { max=d1; min=d2; mid=d3; }
  else if(d2>d1&&d2>d3)
  { max=d2; min=d1; mid=d3; }
  else
  { max=d3; min=d1; mid=d2; }
  int c=(int)Math.round(max*max); int a=(int)Math.round(min*min); int b=(int)Math.round(mid*mid); int d=(int)(a+b);
  if(c==d)
  { count++; }
 }
  System.out.println(count);
}}
  
  
   
  