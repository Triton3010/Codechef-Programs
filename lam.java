interface inter
{
	public void show();
}
class lam implements inter
{
	() -> System.out.println("Hello");
	public static void main(String[] arg)
	{    
	     
	     lam obj = new lam();
		 obj.show();
		 
	}
}