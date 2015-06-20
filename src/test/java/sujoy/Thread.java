package sujoy;

import static java.lang.Thread.sleep;

/**
 * Created by sujoydey on 18/06/15.
 */

class Thread {


    public static void main (String [] args) throws InterruptedException {
        MyThread mt = new MyThread ();
        mt.start();
        sleep(1000);
        for (int i = 0; i < 50; i++)
            System.out.println("Number between" + i);

        sleep(1000);
    }
}
class MyThread extends java.lang.Thread
{
    public void run ()
    {

            for (int i = 0; i <=30; i++)
            {

                    System.out.print ("\n" + i);

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //    System.out.print (i);
           // System.out.print ('\n');
        }
    }

