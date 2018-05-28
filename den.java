import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class den
{
 static void deno(int i,int c)
{
 int l=1;
 if(i>=1&&i<2)
 {   l=1;            }
 else if(i>=2&&i<5)
 {   l=2;            }
 else if(i>=5&&i<10)
 {   l=5;            }
 else if(i>=10&&i<50)
 {   l=10;            }
 else if(i>=50&&i<100)
 {   l=50;            }
 else if(i>=100)
 {   l=100;            }
 int lc=l;
 int r=i%l;
 while(lc<=i)
 {
   lc+=l; c++;
 }
 if(r!=0)
 {  deno(r,c); }
 else
  {
  System.out.println(c);
  }
}

 public static void main(String[] ar) throws IOException
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int n;
 n= Integer.parseInt(br.readLine());
 while(n-->0)
 {
  int coun=0;
  int n1 = Integer.parseInt(br.readLine());
  deno(n1,coun);
 }
}}  