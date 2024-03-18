//calling object
class main_method{
	public static void main(String[]args)
	{
		friend1 f=new friend1();
		f.rohan();
		f.nikit();
		f.harshal();
	}
}

//interface declare
interface frd{
	void rohan();
	void nikit();
	void harshal();

}
//implement in class
class friend1 implements frd{
	public void rohan()
	{
		System.out.println("ROHAN IS MY FRIEND");
	}
	public void nikit()
	{
		System.out.println("NIKIT IS MY FRIEND");

	}
	public void harshal()
	{
		System.out.println("HARSHAL IS MY FRIEND");

	}
}