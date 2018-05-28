import java.util.*;
public class cog1 {

    static int gcd(int[] arr, int a)
    {
        if()
    }
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int result;
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        for(int i=1;i<n-1;i++)
        {
          result = arr[0];
          result = gcd(result, arr[i]);
        }
        System.out.print(result);

    }
}
