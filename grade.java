import java.util.Scanner;
class grade
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  double h=obj.nextDouble();
  double cc= obj.nextDouble();
  double ts=obj.nextDouble(); int index;
  int hi=0; int cci=0; int tsi=0;
  if(h>50)
  { hi=1; } else { }
  if(cc<0.7)
  { cci=1; } else { }
  if(ts>5600)
  { tsi=1; } else { }
 
  if(hi==1&&cci==1&&tsi==1)
  { index=10; } 
  else if(hi==1&&cci==1&&tsi==0)
  { index=9; } 
  else if(hi==0&&cci==1&&tsi==1)
  { index=8; } 
  else if(hi==1&&cci==0&&tsi==1)
  { index=7; }
  else if(hi==1||cci==1||tsi==1)
  { index=6; }
  else
  { index=5; }
  System.out.println(index);
  }}}














  
   