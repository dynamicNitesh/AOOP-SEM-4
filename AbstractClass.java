 class Abstractclass
{
	public static void main(String args[]){
	 Dog d1= new Dog("DOG");
	System.out.print(d1.getName()+" SAYS");
	d1.makeSound();
	}
}
 abstract class Animal
{
	private String name;
	public Animal(String name)
	{
	this.name=name;
	}
	public String getName()
	{
	return name;
	}
	public abstract void makeSound();
}
class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);//name taken from other class using super keyword
	}
	public void makeSound()
	{
		System.out.print(" WOOF");
	}
}
