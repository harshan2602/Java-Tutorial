package OOPS.multithreading;
//    class Book1 implements Runnable {
//        public void run() {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println("Updating DB");
//                try {
//                    Thread.sleep(4000);
//                } catch (InterruptedException ignored) {
//                }
//            }
//        }
//    }

    class Num1 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }

    public class Interface {
        public static void main(String[] args) throws InterruptedException{          //thread
//          Runnable book = new Book1();

//          Runnable book = new Runnable() {    //Book is now an Anonymous Class and can be deleted.
//              @Override
//              public void run() {
//                  for (int i = 1; i <= 5; i++) {
//                      System.out.println("Updating DB");
//                      try {
//                          Thread.sleep(4000);
//                      } catch (InterruptedException ignored) {
//                      }
//                  }
//              }
//          };



        Runnable book = () ->
				{
						for(int i=1;i<=5;i++) {
							System.out.println("Updating Db");
							try {Thread.sleep(2000);} catch (InterruptedException e) {}
						}
				};


          Num1 num = new Num1();

          Thread t1 = new Thread(book);  //we pass the book reference here to link the t1 and book.

          t1.setName("book1");
          System.out.println(t1.getName());

          t1.setPriority(Thread.MAX_PRIORITY);    //MAX_PRIORITY = static variable in thread class
//          t1.setPriority(1);
          System.out.println(t1.getPriority());

            t1.start(); //thread 1  //run , now this understands to execute the run method inside book class.
            num.start();  //thread 2

       /*
		if(book.isAlive()) {
			System.out.println("Still executing");
		}

		book.join();
		num.join();
		if(book.isAlive()) {
			System.out.println("Still executing");
		}


		System.out.println("Bye..");
		*/

        }
    }


