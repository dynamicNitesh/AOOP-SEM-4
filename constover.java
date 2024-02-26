class constover{
	
String name;

	constover(){
		System.out.println("DEFAULT ARGUMENT");
		name ="default";
	}
	constover(String name){
		this.name=name;
		System.out.println("PARMETERIZED CONSTRUCTOR: "+name);
	}
	constover(constover n){
		name=n.name;
		System.out.println("COPY CONSTRUCTOR");
	}
	public static void main(String args[]){
		constover object1,object2,object3;
		object1 = new constover();
		object2 = new constover("NITESH NADAR");
		object3 = new constover(object2);
	}

}