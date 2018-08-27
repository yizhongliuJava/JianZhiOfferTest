package com.java.Test.ThreadProducerConsumer;

import com.java.Test.ThreadProducerConsumer.PublicBox;

/**
 * 生产者
 *
 * @author liuyizhong
 * @date 2018/8/10 15:33
 */
public class Producer implements Runnable {

    private PublicBox box;

    public Producer(PublicBox box) {
        this .box = box;
    }

    @Override
    public void run() {

        for( int i=0;i<10;i++)
        {
            try {
                System. out .println("pro  i:" +i);
                Thread. sleep(30);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

            box.increace();
        }

    }

}
