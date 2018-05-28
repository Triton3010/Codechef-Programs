import java.io.*; import java.util.*;
class Voters
{
 public static void main(String[] ar) throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String[] total = br.readLine().split(" ");
  int a = Integer.parseInt(total[0]);
  int b = Integer.parseInt(total[1]);
  int c = Integer.parseInt(total[2]);
  ArrayList<Integer> a1=new ArrayList<Integer>();
  ArrayList<Integer> a2=new ArrayList<Integer>();
  ArrayList<Integer> a3=new ArrayList<Integer>();
  for(int i=0;i<a;i++)
  { a1.add(Integer.parseInt(br.readLine())); }
  for(int j=0;j<b;j++)
  { a2.add(Integer.parseInt(br.readLine())); }
  for(int k=0;k<c;k++)
  { a3.add(Integer.parseInt(br.readLine())); }
  ArrayList<Integer> a4=new ArrayList<Integer>();
  for(int x=0;x<a1.size();x++)
  {
   if((a2.contains(a1.get(x))||a3.contains(a1.get(x)))&&!a4.contains(a1.get(x)))
    {
      a4.add(a1.get(x));
    }
   }
  for(int y=0;y<a2.size();y++)
   {
   if((a1.contains(a2.get(y))||a3.contains(a2.get(y)))&&!a4.contains(a2.get(y)))
    {
      a4.add(a2.get(y));
    }
   }
    System.out.println(a4.size()); Collections.sort(a4);
   for(int z=0;z<a4.size();z++)
   {
    System.out.println(a4.get(z));
   }
  }}