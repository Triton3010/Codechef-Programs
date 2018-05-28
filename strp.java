import java.util.Scanner;
class strp
{
	public static void main(String[] args)
	{
      Scanner obj = new Scanner(System.in);
      String s = obj.nextLine();
      int count = 0;
      int count_check=1;
      for(int i=0;i<s.length();i++)
      {
      	if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
      	{
          count_check++;
      	}
      	else
      	{
      		if(count_check>count)
      		{
      			count = count_check;
      		}
      		count_check=1;
      	}
      }
      System.out.println(count);
	}
}