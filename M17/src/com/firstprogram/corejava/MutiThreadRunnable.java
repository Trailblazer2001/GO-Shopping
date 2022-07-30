package com.firstprogram.corejava;

public class MutiThreadRunnable {

	public static void main(String[] args) {
		MyThreads t=new MyThreads();
		Thread obj=new Thread(t);
		obj.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
		}
	}

}
class MyThreads implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread...");
		}
	}
}
