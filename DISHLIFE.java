import java.io.*;
import java.util.*;
class DISHLIFE
{
 public static void main(String[] ar) throws Exception
{
 try
 {
 Scanner obj = new Scanner(System.in);
 int n= obj.nextInt();
 while(n-->0)
 { 
  int j = obj.nextInt();
  int k = obj.nextInt(); int flag=0;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  ArrayList<Integer> a1 = new ArrayList<Integer>();
  ArrayList<Integer> a2 = new ArrayList<Integer>();
  for(int z=1;z<=k;z++)
   a1.add(z);
  // HashSet<Integer> hs1 = new HashSet<Integer>(a1);
  for(int i=0;i<j-1;i++)
  {
   String s = br.readLine();
   String[] s1 = s.split(" ");
   for(int l=0;l<s1.length;l++)
   {
    if(!a2.contains(Integer.parseInt(s1[l])))
   {    a2.add(Integer.parseInt(s1[l]));  }     
   } 
   }
  // HashSet<Integer> hs2 = new HashSet<Integer>(a2);
    if(a2.containsAll(a1))
   {    flag=1;        } 
   String last = br.readLine();
   String[] s2 = last.split(" ");
   for(int m=0;m<s2.length;m++)
   {
    if(!a2.contains(Integer.parseInt(s2[m])))
   {    a2.add(Integer.parseInt(s2[m]));  }     
   } 
 // HashSet<Integer> hs3 = new HashSet<Integer>(a2);
    if(a2.containsAll(a1)&&flag!=1)
    {    flag=2;   }

     if(flag==1)
   { System.out.println("some"); }
    else if(flag==2)
   { System.out.println("all"); }
    else
   { System.out.println("sad"); }
}}
 catch(Exception e) {  }
  
}} 
   
  
  
   
  
  
  
   