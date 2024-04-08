class mythread implements Runnable{
	public void run(){
		System.out.println("THREAD IS RUNNING");
	}
	
	public static void main(String args[]){
	mythread t1 = new mythread();
	Thread t= new Thread(t1);
	t.start();
	}
}