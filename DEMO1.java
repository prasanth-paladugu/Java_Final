//EXAMPLE ON FINAL DECLARATIONS
class TEST											//USER DEFINED CLASS
{
	int a=100;
}
public class DEMO1									//MAIN CLASS
{
	final int z=11;									//INTIALIZING WITH FINAL KEY WORD/MODIFIER
	static final int n=222;							//INTIALIZING WITH FINAL KEY WORD/MODIFIER
	public static void main(String[]arg)
	{
		final int x=123;							//INTIALIZING WITH FINAL KEY WORD/MODIFIER
		final TEST ob=new TEST();					//INTIALIZING WITH FINAL KEY WORD/MODIFIER
		System.out.println("x	:"+x);
		/*x=258;*/									//CTE BECAUSE x IS INTIALIZED WITH FINAL MODIFIER WE CANNOT MODIFY IT
		/*n=876;*/									//CTE BECAUSE n IS INTIALIZED WITH FINAL MODIFIER WE CANNOT MODIFY IT
		System.out.println("n	:"+n);
		System.out.println("a	:"+ob.a);
		/*ob=new TEST();*/							//CTE BECAUSE ob IS INTIALIZED WITH FINAL MODIFIER WE CANNOT REASSIGN IT
		ob.a=45;
		System.out.println("a	:"+ob.a);
	}
}