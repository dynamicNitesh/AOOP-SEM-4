class Main {
 static	String name="NITESH NADAR";
  // Static method
  static void myStaticMethod() {
    System.out.println("STATIC METHOD....");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("PUBLIC METHOD.....");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod();
    Main myObj = new Main();
    myObj.myPublicMethod();
	System.out.println(name);
  }
}
