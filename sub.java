import java.util.*;
class sub
{
 public static void main(String[] ar)
{
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 {
   int len1=obj.nextInt(); ArrayList<Integer> a1=new ArrayList<Integer>();
   for(int i=0;i<len1;i++)
 {  
   a1.add(obj.nextInt()); }
   int len2=obj.nextInt(); ArrayList<Integer> a2=new ArrayList<Integer>();
   for(int j=0;j<len2;j++)
 {  
   a2.add(obj.nextInt()); }
 if(a1.containsAll(a2))
 {  System.out.println("Yes");  }
 else
 { System.out.println("No");  }
}}}
