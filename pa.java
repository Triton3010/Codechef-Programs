class pa
{
	public static void main(String ar[])
	{
		
	int k=0;
		int md[][]=new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				md[i][j]=k++;
		}}
			for(int i=0;i<4;i++)
		{
			System.out.println();
			for(int j=0;j<4;j++)
			{
				System.out.print(md[i][j]+" ");
			}
		}
	}

}