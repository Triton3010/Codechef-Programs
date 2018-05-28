import java.io.*;
class col
{
 public static void main(String[] ar) throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int n= Integer.parseInt(br.readLine());
 while(n-->0)
 {
 String s1=br.readLine(); int ca=0; int cb=0;
 for(int i=0;i<s1.length();i++)
 {
  if(s1.charAt(i)=='a') {  ca++;  }
 }
 cb=s1.length()-ca;
 if(ca<cb)
 {
  System.out.println(ca);
 }
 else
 {
  System.out.println(cb);
 }
}}}
 