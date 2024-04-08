class mythread extends Thread{
	public void run(){
		System.out.println("THREAD IS RUNNING");
	}
	public static void main(String args[]){
	mythread t1 = new mythread();
	t1.start();
	}
}