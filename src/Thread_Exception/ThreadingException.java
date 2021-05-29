package Thread_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Multithreading extends Thread {

    private int add = 300;

    @Override
    public void run() {
        Thread thread = new Thread();
        System.out.println("Thread Starts...");
        long interval = 1000;
        try {
            System.out.println("Sleep Method");
            for (int i = 1; i < 20; i++) {
                if (i % 2 == 0) {
                    thread.sleep(interval); //used to stop/sleepworking for given amount of time 
                    System.out.println(i);
                }
            }
            if (add > 300) {
                waitMethod();
            }
        } catch (InterruptedException e) //used to catcgh the exception error
        {
            System.out.println(e);
        }
        System.out.println("After Waiting.. The Number is : " + this.add);
    }

    private void waitMethod() {
        try {
            System.out.println("Wait Method");
            wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void returnNum() {
        this.add = add + 100;
        notifyAll();
    }

//throws helps us to indicates the exception in method     
    public void Limit(int n) throws ArithmeticException {
        if (n < 20) {
            throw new ArithmeticException("Your age should be greater then 20");
        } else {
            System.out.println("Your age is perfect!");
        }
    }
}

class Checkedunchecked {

    public void checkedException() {
        File file = new File("abc.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void UncheckedException(String name) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Empty file");
        }
    }
}

public class ThreadingException {

    public static void main(String[] args) {
        Multithreading mobj = new Multithreading();
        Multithreading mobj1 = new Multithreading();
        //Multithreading mobj2 = new Multithreading();
        mobj.start();
        try {
            mobj.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        mobj1.start();
        //mobj2.start();
        mobj.Limit(23);

        //Checkedunchecked cobj = new Checkedunchecked();
        //cobj.checkedException();
        //cobj.UncheckedException(null);
    }
}
