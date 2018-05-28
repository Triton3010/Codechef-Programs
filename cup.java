import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class cup
{
 public static void main(String[] ar) throws IOException
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int n,i,r=0,m=0;
 n=Integer.parseInt(br.readLine());
  while(n-- > 0) 
 { 
 int temp=Integer.parseInt(br.readLine());
  System.out.println((temp/2)+1);
}
}}