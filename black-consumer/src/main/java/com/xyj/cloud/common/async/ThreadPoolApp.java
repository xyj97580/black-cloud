package com.xyj.cloud.common.async;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by xyj97 on 2018/10/30.
 * 当批量查询数据量比较大时，串行查询耗时比较大，因此选则并行查询
 */
public class ThreadPoolApp {


    static int THREAD_COUNT = 30; // 根据服务配置选择大小

    public static void main(String[] args) throws InterruptedException {
        List<Integer> li = Lists.newArrayList();
        li.add(1);
        li.add(2);
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        CountDownLatch countDownLatch = new CountDownLatch(li.size());
        long start = System.currentTimeMillis();
        for (int i = 0; i < li.size(); i++) {
            final int inddex = i;
            executorService.submit(() -> {
                String result = query(li.get(inddex));
                System.out.println(String.format("->%s, %s", inddex, result));
                countDownLatch.countDown();
            });
        }
        if (countDownLatch.await(10, TimeUnit.SECONDS)) {
            long end = System.currentTimeMillis();
            System.out.println(String.format("查询次数：%s，总耗时：%s", li.size(), end - start));
        }

        // 以上代码等价于下列代码：
       /* li.parallelStream().forEach( x -> {
            query(li.get(x));
        });*/
    }

    static String query(int value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Result" + value;
    }
}
