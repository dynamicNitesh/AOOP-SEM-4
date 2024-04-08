//Write a program in Java to develop Banking Application in whichuser deposits the amount Rs 25000 and then start withdrawing of
//Rs 20000, Rs 4000 and it throws exception "Not Sufficient Fund" when user withdraws Rs. 2000 thereafter.

import java.util.Scanner;

class branchexp{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);//taking input
	bank u1=new bank(2024,"NITESH NADAR",45000);
	boolean login=true;
	while (login){
	System.out.println("SELECT YOUR CHOICE");
	System.out.println("1 - Display\n2 - Deposit\n3 - withdraw\n4 - Exit");
	System.out.println("Enter your choice:");
	int ch=scan.nextInt();
	switch (ch){
		case 1:
		u1.display();
		break;
		
		case 2:
		System.out.println("ENTER THE AMOUNT TO DEPOSIT:");
		u1.deposit(scan.nextInt());
		break;
		case 3:
		System.out.println("ENTER THE AMOUNT TO withdraw:");
		u1.withdraw(scan.nextInt());
		break;
		 case 4:
						
         login = false;
         break;
		
	}
	}
	}
	}
	
	class bank{
		private int balance;
		private int no;
		private String name;
		
		public bank(int no,String name, int balance){
			this.name=name;
			this.no=no;
			this.balance=balance;
		}
		public void display(){
			System.out.println("ACCOUNT NO:"+no);
			System.out.println("ACCOUNT HOLDER:"+name);
			System.out.println("ACCOUNT BALANCE:"+balance);

		}
		public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Your Updated Balance is : " + balance);
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new ArithmeticException("No sufficient Balance to withdraw");
        } else {
            balance = balance - amount;
            System.out.println("Your Updated Balance is : " + balance);
        }
    }
}
	
	