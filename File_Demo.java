import java.io.*;

public class File_Demo
{
        public static void main(String args[ ])throws IOException {

            String s1=args[0];
            String s2=args[1];


            Readfile rf=new Readfile();

            Thread th1=new Thread()
            {
                public void run()
                {
                    try {
                        rf.read(s1);
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }

            };
            Thread th2=new Thread()
            {
                public void run()
                {
                    try {
                        rf.read(s2);
                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }

            };th1.start();th2.start();

        }
}

class Readfile
{
    public void read(String str)throws  IOException
    {

        LineNumberReader lmr=new LineNumberReader(new FileReader(str));

        String thisline="";

        while((thisline=lmr.readLine())!=null)        {
            System.out.println(lmr.getLineNumber()+"."+thisline);
            try {
                Thread.sleep(2000);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        } }

}