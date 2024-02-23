class Shape{
	static float area(float r){
	return 3.14f* r * r;
	}
	static int area(int h,int w){
	return h * w;
	}
	static int area(int l){
	return l * l;
	}
	public static void main(String args[]){
	float areaCir =area(2.3f);
	System.out.println("AREA OF CIRCLE IS :"+areaCir);
	
	int areaRec =area(20,30);
	System.out.println("AREA OF RECTANGLE IS :"+areaRec);
	
	float areaSqr =area(20);
	System.out.println("AREA OF CIRCLE IS :"+areaSqr);
	}
}