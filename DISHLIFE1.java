import java.io.*;
class DISHLIFE1
{
 public static void main(String[] ar) throws Exception
{
 try
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int n= Integer.parseInt(br.readLine());
 while(n-->0)
 { 
  String[] s3 = br.readLine().split(" ");
  int j = Integer.parseInt(s3[0]); int k = Integer.parseInt(s3[1]); int flag=0;
  int[] arr = new int[k+1];
  boolean bool = true; boolean bool1=true;
  for(int i=0;i<j-1;i++)
  {
   String[] s1 = br.readLine().split(" ");
   for(int l=0;l<s1.length;l++)
   {
    arr[Integer.parseInt(s1[l])]++;    
   } 
  }
    for(int o=1;o<k+1;o++)
   {
    if(arr[o]>=1)
    { continue; }
    else
    { bool=false; break; }   
   } 
   if(bool)
   { flag=1; }
   String last = br.readLine();
   String[] s2 = last.split(" ");
   for(int p=0;p<s2.length;p++)
   {
    arr[Integer.parseInt(s2[p])]++;    
   } 
    for(int q=1;q<k+1;q++)
   {
    if(arr[q]>=1)
    { continue; }
    else
    { bool1=false; break; }   
   } 
    if(bool1&&flag!=1)
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
   
  
  
   
  
  
  
   