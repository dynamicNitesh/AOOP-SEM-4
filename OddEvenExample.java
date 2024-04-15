//**EXP 26*//
public class OddEvenExample
{
    public static void main(String[] args)
    {
		//call object..
        NewThread t1 = new NewThread("Odd");
        NewThread t2 = new NewThread("Even");
        t1.start();
        t2.start();
    }
}
class NewThread extends Thread
{
    NewThread(String threadname)
    {
        super(threadname); //primarily in inheritance to refer to the immediate parent class of a subclass
    }
    public void run()
    {
        if(getName().equals("Odd")==true)  
        {
            for(int i=1;i<=200;i=i+2)
            {
                System.out.print("\nOdd: " + i);
                try //it check the exception
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) //it throw exception
                {
                    System.out.println("Exception Occurred.");
                }
            }
        }
        else
        {
            for(int i=2;i<=200;i=i+2)
            {
                if(i%10==0)
                System.out.println();
                System.out.print("\nEven: " + i);
                try //it check the exception
                {
                    Thread.sleep(500);//gap
                }
                catch (InterruptedException e) //it throw exception
                {
                    System.out.println("Exception Occurred.");
                }
            }
        }
    }
}
