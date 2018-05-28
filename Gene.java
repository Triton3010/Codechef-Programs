class Gen<G extends Number,T extends Number>
{
	G c;
	Gen(G ab,T bc)
	{
    G a = ab;
	T b = bc;
	c = ab+bc;
	}
	void show()
	{
		System.out.print(c);
	}
	
}
class Gene
{
	public static void main(String args[])
	{
	Gen<Integer,Integer> g1 = new Gen<Integer,Integer>(4,5);
	g1.show();
	}
}