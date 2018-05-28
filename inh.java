class inh1
{
	int x=10;
	void show()
	{
		System.out.println("show from show of inh1");
	}
}
class inh2 extends inh1
{
	void show()
	{
		System.out.println("show from show of inh2");
	}
}
class inh
{
	public static void main(String args[])
	{
	inh1 ref1=new inh1();
	ref1.show();
    inh2 n1=new inh2();
	n1.show();
    inh1 ref;
    ref=ref1;
    ref.show();
    ref=n1;
    ref.show();
	}
}