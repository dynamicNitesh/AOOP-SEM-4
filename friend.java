class friend4{
	public static void main(String args[])
	{
		//creating an object..
	friend3 f=new friend3();
		f.frd1();
		f.frd2();
		f.frd3();
	}
}
//class 1
class friend1{
//method
void frd1(){
System.out.println("ROHAN");
}
}
//class 2
class friend2 extends friend1{
//method
void frd2(){
System.out.println("HARSHAL");	
}
}	
//class 3
class friend3 extends friend2{
//method
void frd3(){
System.out.println("NIKIT");
}
}

