import java.util.Scanner;

public class Printing
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    String[] a = new String[10000];
    int index=0;
    for(int i=0; i<10000; i++)
    {
       a[i] = obj.nextLine();
       if (a[i].trim().isEmpty())
       {
         index = i; break;
       }
    }
    for(int j=index/2; j<index; j++)
    {
      System.out.println(a[j]);
    }
    for(int k=0; k<index/2; k++)
    {
      System.out.println(a[k]);
    }
  }}

private static void mostFreq3(int a[], int n, int b[]) {

 int[] farr = new int[10000];
 for(int k=0;k<a.length;k++)
 {
   farr[a[k]]++;
 }
 Arrays.sort(farr);
 b[0] = farr[9999]; 
 b[1] = farr[9998]; 
 b[2] = farr[9997]; 
}