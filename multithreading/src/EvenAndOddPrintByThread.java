public class EvenAndOddPrintByThread implements Runnable{

    static int count=0;

    Object object;

    public EvenAndOddPrintByThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (count<11){
            if(count%2==0 && Thread.currentThread().getName().equalsIgnoreCase("even")){
                synchronized (object){
                    System.out.println("Thread Name:"+Thread.currentThread().getName()+"Value: "+count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            if (count%2==1 && Thread.currentThread().getName().equalsIgnoreCase("odd")){
                synchronized (object){
                    System.out.println("Thread Name:"+Thread.currentThread().getName()+" Value: "+count);
                    count++;
                    object.notify();
                }
            }
        }
    }
    public static void main(String[] args){
        Object lock=new Object();
        Runnable r1=new EvenAndOddPrintByThread(lock);
        Runnable r2=new EvenAndOddPrintByThread(lock);
        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();
    }
}
