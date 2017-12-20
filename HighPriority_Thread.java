public class HighPriority_Thread {
    public static void main(String[] args) {

        Mythread m1=new Mythread("Thread_A");
        m1.setPriority(8);
        m1.start();

        Mythread m2=new Mythread("Thread_B");
        m2.setPriority(10);
        m2.start();

        Mythread m3=new Mythread("Thread_C");
        m3.setPriority(7);
        m3.start();

    }
}
class Mythread extends Thread {

    public Mythread(String name)
    {
        super(name);
    }
    public void run()
    {
        Thread th=Thread.currentThread();
        for(int i=0;i<10;i++) {
            System.out.println(i+"\t"+th.getPriority()+"\t"+th.getName());

            try{
                sleep(1000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}