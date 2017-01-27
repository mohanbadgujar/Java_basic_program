import java.util.Scanner;
public class StopWatch
{
	long StartTime = 0,StopTime = 0, Elapsed = 0;
	public void start()
	{
		StartTime = System.currentTimeMillis();
	}
	public void stop()
	{
		StopTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime()
	{
		Elapsed = (StopTime - StartTime);
		return Elapsed;
	}

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int startChoice,stopChoice;
		StopWatch w = new StopWatch();
		System.out.println("Please enter any number to start clock");
		startChoice = in.nextInt();
		w.start();
		System.out.println("Time is Started\nPlease enter any number to stop the clock");
		stopChoice = in.nextInt();
		w.stop();
		System.out.println("Elapsed Time-: "+w.getElapsedTime()+" mili Seconds");
	}
}







//long elapseTime=w.getElapsedTime();
//  System.out.println("Elapsed time in second="+(elapseTime/1000));
