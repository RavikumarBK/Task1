import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class String_Find {

    public static void main(String args[])throws IOException {
        String str1[]=new String[args.length];
        if(args.length>0)
        {
            for(int i=0;i<args.length;i++)
                str1[i]=args[i];

        }
        SearchString s=new SearchString();
        Thread th1=new Thread()
        {
            public void run()
            {
                try {
                    int val=s.search(str1[0]);
                    if(val == 1)
                    {
                        System.out.println(" Thread_1->> Word  exist");
                    }else
                    {
                        System.out.println("Thread_1->> Word does not exist");
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
                    int val=s.search(str1[1]);
                    if(val == 1)
                    {
                        System.out.println(" Thread_2->> Word  exist");
                    }else
                    {
                        System.out.println("Thread_2->> Word does not exist");
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
                    int val=s.search(str1[2]);
                    if(val == 1)
                    {
                        System.out.println(" Thread_3->> Word  exist");
                    }else
                    {
                        System.out.println("Thread_3->> Word does not exist");
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

                    int val=s.search(str1[3]);
                    if(val == 1)
                    {
                        System.out.println(" Thread_4->> Word  exist");
                    }else
                    {
                        System.out.println("Thread_4->> Word does not exist");
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
