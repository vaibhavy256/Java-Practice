public class threadMethods extends Thread{
    public threadMethods(String t1) {
        super(t1);
    }

    @Override
    public void run(){
        System.out.println("Thread is running.....");
        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName()+" is running");
            Thread.yield();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        threadMethods t1=new threadMethods("t1");
        threadMethods t2=new threadMethods("t2");
        t1.start();
        //t1.join();
        System.out.println("Hello new thread t2");
        t2.start();
    }
}
