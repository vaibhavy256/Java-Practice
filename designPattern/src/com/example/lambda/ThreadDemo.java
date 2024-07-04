package com.example.lambda;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Runnable thread=()->{
				for(int i=0;i<=2000;i++) {
					System.out.println("Square of "+i +" = "+(i*i) );
					try {
						Thread.sleep(10);
					}
					catch(Exception e) {
						e.printStackTrace();;
					}
				}
			};
			Thread t=new Thread(thread);
			t.start();
	}

}
