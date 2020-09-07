//EXAMPLE ON FINAL CLASSES
final class one									//USER DEFINED FINAL CLASS
{
	public void m1()
	{
		System.out.println("M1");
	}
}
/*class two extends one							//FINAL CLASSCANNOT HAVE CHILD CLASSES
{												//THIS IS INVALID OPERATION
	public void m2()
	{
		System.out.println("M2");
	}
}*/
class three										//USER DEFINED CLASS
{
	public void m3()
	{											//THIS IS VALID OPERATION
		one ob=new one();						//CREATING OBJECT FOR FINAL CLASS
		ob.m1();
		System.out.println("M3");
	}
}
public class DEMO4								//MAIN CLASS
{
	public static void main(String[]arg)
	{
		three ob1=new three();
		ob1.m3();
	}
}