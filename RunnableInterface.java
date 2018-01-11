class ThreadExample implements Runnable
{
	private Thread t;
	private Thread t2;
	private String t2Name;
	private String threadName;
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
				System.out.println("Thread: "+t2Name+",  "+i);
				t.sleep(1000);
		
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted thread: "+ie);
		}
		System.out.println("Thread: "+threadName+" exiting");
		System.out.println("Thread: "+t2Name+" exiting");
	}
	public void start()
	{
		System.out.println("Starting thread: "+threadName);
		System.out.println("Starting thread: "+t2Name);
		if(t==null)
		{
			t = new Thread(this,threadName);
			t2 = new Thread(this,t2Name);
			t.start();			
			
		}
	}
}
public class RunnableInterface
{
	public static void main(String a[])
	{
		ThreadExample te = new ThreadExample("Thread-1: ","Thread-2:");
		te.start();
		
	}
}