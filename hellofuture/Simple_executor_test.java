package com.company;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.*;

public class Simple_executor_test {


    private static final int NTHREADS = 10;

    public static void main(String[] args) {

        /*
        Counter counter = new Counter();
        ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);

        for (int i = 0; i < 50; i++) {
            Runnable worker = new CounterPlus(counter);
            executor.execute(worker);
        }

        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();

        // Wait until all threads finish
        while (!executor.isTerminated()) {}

        System.out.println("Finished all threads");
        System.out.format("\nCounter_1: %d, Counter_2 %d\n\n",
                counter.get_c1(), counter.get_c2());

     */
  	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	List<Future<Double>> list = new ArrayList<>();
	double a=0;
	double b=Math.PI;
	double N=1000000;
	double dx=(b-a)/N;
	double result=0;
	long start = System.nanoTime();
	for (int i=0; i<N; i++)
	 {
	     Callable<Double> callable = new Calka_callable(a + i*dx, a+(i+1)*dx,dx);
	     Future<Double> future = executor.submit(callable);
	     list.add(future);
	}

        for(Future<Double> future : list)
        {
            try
            {
                result+=future.get();
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        }
     long end =System.nanoTime() - start;
       System.out.println("result =" + result+"\t w czasie \t"+end);

	executor.shutdown();



    }
}
