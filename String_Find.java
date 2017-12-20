import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class String_Find {

    public static void main(String args[])throws IOException {
        String s1=args[0];
        String s2=args[1];
        String s3=args[2];
        String s4=args[3];
        SearchString s=new SearchString();
        Thread th1=new Thread()
        {
            public void run()
            {
                try {
                    int val=s.search(s1);
                    if(val == 1)
                    {
                        System.out.println(" Thread_1->>Word  exist");
                    }else
                    {
                        System.out.println("Thread_1->>Word does not exist");
                    }
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
                    int val=s.search(s2);
                    if(val == 1)
                    {
                        System.out.println(" Thread_2->>Word  exist");
                    }else
                    {
                        System.out.println("Thread_2->>Word does not exist");
                    }
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        };
        Thread th3=new Thread()
        {
            public void run()
            {
                try {
                    int val=s.search(s3);
                    if(val == 1)
                    {
                        System.out.println(" Thread_3->>Word  exist");
                    }else
                    {
                        System.out.println("Thread_3->>Word does not exist");
                    }
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        };
        Thread th4=new Thread()
        {
            public void run()
            {
                try {

                    int val=s.search(s4);
                    if(val == 1)
                    {
                        System.out.println(" Thread_4->>Word  exist");
                    }else
                    {
                        System.out.println("Thread_4->>Word does not exist");
                    }

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        };th1.start();th2.start();th3.start();th4.start();

    }
}

class SearchString
{
    public int search(String word) throws IOException
    {

        int val = 0;


        Scanner file = new Scanner(new File("/home/ravik/abc.txt"));

        while(file.hasNextLine())
        {
            String line = file.nextLine();
            if(line.indexOf(word) != -1)
            {
                val = 1;
                break;
            }
            else
            {
                val = 0;
                continue;
            }
        }
        return val;
    }
}
