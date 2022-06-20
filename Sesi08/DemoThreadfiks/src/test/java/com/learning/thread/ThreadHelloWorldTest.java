package com.learning.thread;

import org.junit.Test;

public class ThreadHelloWorldTest {

    public ThreadHelloWorldTest() {

    }

    @Test
    public void testRun() {

        System.out.println("----------");
        for (int i = 0; i < 10; i++) {
            int tes = i * i * i;
            ThreadWorld instance = new ThreadWorld();
            Thread t = new Thread(instance);
            t.start();
        }
    }

}
