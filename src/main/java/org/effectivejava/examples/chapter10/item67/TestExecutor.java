package org.effectivejava.examples.chapter10.item67;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>Created by Damon.Q on 2017/4/1.
 */
public class TestExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(123);
            }
        });

        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);

        executorCompletionService.poll();
    }
}
