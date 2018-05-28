import java.util.*;
class farm
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
  int len1=obj.nextInt(); int max; int min;
  int arr1[]=new int[len1];
  for(int i=0;i<arr1.length;i++)
  { arr1[i]=obj.nextInt(); }  
  int len2=obj.nextInt();
  int arr2[]=new int[len2];
  for(int j=0;j<arr2.length;j++)
  { arr2[j]=obj.nextInt(); }

  String s1=Arrays.toString(arr1);
  String s2=Arrays.toString(arr2);
  if(s1.indexOf(s2)>=0||s2.indexOf(s1)>=0)
  { System.out.println("Yes"); }
  else
  {
  System.out.print(); System.out.print(s2);
  }
 
}}}