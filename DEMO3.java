//EXAMPLE ON FINAL METHODS OVERLOADING
class BAT											//USER DEFINED PARENT CLASS
{
	public final void m1(String s)					//METHOD DECLARED WITH FINAL MODIFIER/KEY WORD
	{
		System.out.println(s);
	}
	public final void m1(int x)						//METHOD DECLARED WITH FINAL MODIFIER/KEY WORD
	{
		System.out.println(x);
	}
}
class BALL extends BAT								//USER DEFINED CHILD CLASS
{
	/*public  void m1(int x)*/						//METHOD DECLARED WITH FINAL MODIFIER/KEY WORD CANNOT BE RE USED
	public void m1(boolean p)
	{
		System.out.println(p);
	}
}
public class DEMO3									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		BALL ob=new BALL();
		ob.m1(true);
		ob.m1(10);
		ob.m1("PP");
	}
}