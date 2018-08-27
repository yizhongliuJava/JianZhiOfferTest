package com.java.Test.ThreadProducerConsumer;


/**
 * 消费者
 *
 * @author liuyizhong
 * @date 2018/8/10 15:34
 */
public class Consumer implements Runnable {
    private PublicBox box;

    public Consumer(PublicBox box) {
        this.box = box;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Con: i " + i);
                Thread.sleep(3000);                // 这里设置跟上面30不同是为了 盒子中的苹果能够增加，不会生产一个马上被消费
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

            box.decreace();
        }
    }
}