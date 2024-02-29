/** Experiment 17 - Write a program in Java to demonstrate method overriding.*/
class OverRide{
	public static void main(String args[]){
		parent p1 = new parent();
		p1.demo();
		p1.display();
		Child c1 = new Child();
		c1.demo();
		c1.display();
	}
}
class parent {
	void display(){
		System.out.println("Base Class method : Display");
	}
	void demo(){
		System.out.println("Base Class method : Demo");
	}
}
class Child extends parent{
	void demo(){
		System.out.println("Child Class method : Demo");
	}
}