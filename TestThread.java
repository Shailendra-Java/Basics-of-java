class ThreadExample extends Thread
{
	private Thread t;
	private Thread t2;
	public String t2Name;
	public String threadName;
	public ThreadExample(String name, String t2Name)
	{
		threadName = name;
		this.t2Name= t2Name;
		System.out.println("Creating thread: "+threadName);
		System.out.println("Creating thread: "+t2Name);
	}
	public void run()
	{
		System.out.println("Running thread : "+threadName);
		System.out.println("Running thread : "+t2Name);
		try
		{
			for(int i=1; i<5; i++)
			{
				System.out.println("Thread: "+threadName+",  "+i);
				t.sleep(1000);
				System.out.println("Thread: "+t2Name+",  "+i);
				
				
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted thread: "+ie);
		}
		System.out.println("Thread: "+threadName+" exiting");
		System.out.println("Thread: "+t2Name+" exiting");
	}
	
}
public class TestThread
{
	public static void main(String a[])
	{
		ThreadExample te = new ThreadExample("My Thread: ","Your Thread:");
		System.out.println("Starting thread: "+te.threadName);
		System.out.println("Starting thread: "+te.t2Name);
		te.start();
		
	}
} 