import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ins
{
 public static void main(String[] args) throws IOException
{
 int n,k,i,j,point=0,index=0;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 n=Integer.parseInt(br.readLine());
 byte b[] = new byte[n];
 int s[] = new int[n];
 for(k=0;k<n;k++)
{
 i=Integer.parseInt(br.readLine());
 j=Integer.parseInt(br.readLine());
 int d= Math.abs(i-j);
 if(i>j)
{
 b[k]=1;
 s[k]=d; 
}
else
{
 b[k]=2;
 s[k]=d;
}}
for(k=0; k<n; k++)
        {
            if(s[k] > index)
            {
                index = s[k];
                point = k;
            }
       }
System.out.println(b[point]);
System.out.println(s[point]);
}}