package OOPS.multithreading;
/*
Multithreading
Till now we have seen only single thread that is the main method running if we want to run 2 or more
methods to run simultaneously side by side we use multithreading.

In my CPU, there are 6 cores, in each core 2 threads can run simultaneously. so the total logical
processors is 12. Strictly speaking, at a time my processor can handle only 12 threads at a time.
Processor allocates micro time/seconds to each threads and it switches fast,takes turns,
so when we see it shows 4000 threads like that but in reality only 12 threads
can be run at a time simultaneously.
we can code and listen to music simultaneously right.
intellij is a process, inside that it can have many threads.
music player is also a process and same inside that it can have many threads.
when you type in word doc, one thread displays the words you type from keyboard and a other
thread checks any spelling mistakes simultaneously.
 */

class Book extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating DB");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

class Num extends Thread {
    public void run() { //method name should be run since down there start method searches for it. //public
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {          //thread
        Book book = new Book();
        Num num = new Num();

        book.start(); //thread 1
        num.start();  //thread 2

        if (book.isAlive()) {
            System.out.println("Still Executing.");
        }

        book.join();  //let this thread gets completed and joins with main thread after that execute stuffs down below.
        num.join();  //join-main thread will be waiting for num to be completed.

        if (book.isAlive()) {
            System.out.println("Still Executing.");
        }
        else{
            System.out.println("Finished Executing");
        }

        System.out.println("Bye...");
    }
}
