public class HighPriority_Thread {
    public static void main(String[] args) {

        
        Thread th1=new Thread()
        {
            public void run()
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.pintln(i);
                    try{
                    sleep(5000);
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        
        Thread th2=new Thread()
        {
            public void run()
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.pintln(i);
                    try{
                    sleep(5000);
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };th1.setPriority(8);th2.setPriority(5);
          th1.start();th2.start();
        

    }
}
