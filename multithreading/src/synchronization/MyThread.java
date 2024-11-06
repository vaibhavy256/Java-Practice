package synchronization;

public class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for (int i=0;i<1000;i++){
            counter.increment();
        }
    }

}
