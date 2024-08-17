public class ThreadsDemo implements Runnable {
    public static void main(String[] args) {
        ThreadsDemo obj = new ThreadsDemo();
        Thread t1 = new Thread(obj);
        t1.setName("tessa");
        t1.start(); // This starts a new thread
        System.out.println("Main thread is running");


        System.out.println("Using lambda expression");
        
        // Fixing the lambda expression and starting it in a new thread
        Runnable t2 = () -> {
            System.out.println("Thread is running");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };

        // Creating a new thread for the lambda Runnable
        Thread thread2 = new Thread(t2);
        thread2.setName("lambdaThread");
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
