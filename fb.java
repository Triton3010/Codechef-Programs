import java.util.Scanner;

class fb{
 public static void main(String[] args){
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0){
 int a = obj.nextInt();
 String[] s1 = new String[a];
 int c1, c2;
 c1=0;
 for(int i=0;i<a;i++)
 {
 s1[i] = obj.next();
 }
 String temp = s1[0];
 String temp2 = null;
 for(int i=0;i<a;i++)
 {
  if(s1[i].equals(temp))
  {
  c1++;
  }
  else
  {
  temp2=s1[i];
  }
  }
  c2 = a-c1;
  if(c1>c2)
  {
  System.out.println(temp);
  }
  else if(c2>c1)
  {
  System.out.println(temp2);
  }
  else
  {
  System.out.println("Draw");
  }
 }}}
  
 
 