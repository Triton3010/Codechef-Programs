class A
{
	static class B
	{
		static class C
		{
			static class D
			{
			void show()
			{
				System.out.println("Hello from D");
			}}
		}
	}
	
}
class S
{
	public static void main(String ar[])
	{
		A.B.C.D ob=new A.B.C.D();
		ob.show();
	}
}