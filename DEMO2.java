//EXAMPLE ON FINAL METHODS
class BASE											//USER DEFINED PARENT CLASS
{
	public final void m1()							//METHOD DECLARED WITH FINAL MODIFIER/KEY WORD
	{
		System.out.println("BASE m1()");
	}
}
class DERIVED extends BASE							//USER DEFINED CHILD CLASS
{
	/*public void m1()*/							//METHOD NAMES DECLARED WITH FINAL CANNOT BE USED IN CHILD CLASS
	public void m2()
	{
		System.out.println("DERIVED m2()");
	}
}
public class DEMO2									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		DERIVED ob=new DERIVED();
		ob.m1();
		ob.m2();
	}
}