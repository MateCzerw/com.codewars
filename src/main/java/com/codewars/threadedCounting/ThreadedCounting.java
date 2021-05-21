package com.codewars.threadedCounting;

public class ThreadedCounting {
    int status = 0;

    public static void countInThreads(Counter counter) throws InterruptedException {
        ThreadedCounting obj = new ThreadedCounting();
        Thread t1 = new Thread(new Print(obj, 0));
        Thread t2 = new Thread(new Print(obj, 1));
        Thread t3 = new Thread(new Print(obj, 2));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }


    static class Print implements Runnable {
        ThreadedCounting obj;
        int threadNumber;

        public Print(ThreadedCounting obj, int threadNumber) {
            this.obj = obj;
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            try {

                if (threadNumber == 0) {
                    synchronized (obj) {
                        for (int i = 1; i <= 100; i++) {
                            while (obj.status != 0 && obj.status != 3) {
                                obj.wait();
                            }

//                        System.out.println(0);
                            if (obj.status == 0)//even sets status to 0 so next one is odd
                                obj.status = 1;
                            else//odd sets status to 3 so next one is even
                                obj.status = 2;
                            obj.notifyAll();
                        }
                    }
                } else if (threadNumber % 2 != 0) {
                    synchronized (obj) {
                        for (int i = 1; i <= 100; i++) {
                            while (obj.status != 1) {
                                obj.wait();
                            }

                            System.out.println(threadNumber);
                            threadNumber += 2;
                            obj.status = 3;
                            //3 decides 0 came after odd, so next one
                            //after zero is even
                            obj.notifyAll();
                        }
                    }
                } else {
                    synchronized (obj) {
                        for (int i = 1; i <= 100; i++) {
                            while (obj.status != 2) {
                                obj.wait();
                            }

                            System.out.println(threadNumber);
                            threadNumber += 2;
                            obj.status = 0;
                            obj.notifyAll();
                        }
                    }
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


