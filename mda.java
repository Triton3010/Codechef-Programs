class mda
{
	public static void main(String args[])
	{
		int k=10;
		int md[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				md[i][j]=k--;
		}}
			for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print(md[i][j]+" ");
			}
		}
	}
}