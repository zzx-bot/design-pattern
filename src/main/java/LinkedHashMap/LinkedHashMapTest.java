package LinkedHashMap;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedHashMapTest {

    public static void main(String[] args) throws InterruptedException {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("星期一", 1);
        linkedHashMap.put("星期二", 2);
        linkedHashMap.put("星期三", 3);
        linkedHashMap.put("星期四", 4);
        linkedHashMap.put("星期五", 5);
        linkedHashMap.put("星期六", 6);
        linkedHashMap.put("星期日", 7);
        System.out.println("打印:" + linkedHashMap.toString());
        long start = System.currentTimeMillis();

        Iterator<Map.Entry<String, Integer>> entryIterator = linkedHashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            TimeUnit.MILLISECONDS.sleep(1);
            Map.Entry<String, Integer> next = entryIterator.next();
            System.out.println("key=" + next.getKey() + " value=" + next.getValue());
        }
        System.out.println("entrySet循环遍历方式 : " + (System.currentTimeMillis() - start) + "ms");

        Iterator<String> keySetIterator = linkedHashMap.keySet().iterator();
        start = System.currentTimeMillis();
        while (keySetIterator.hasNext()) {
            TimeUnit.MILLISECONDS.sleep(1);
            String key = keySetIterator.next();
            System.out.println("key=" + key + " value=" + linkedHashMap.get(key));
        }
        System.out.println("keySet循环遍历方式 : " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        linkedHashMap.forEach((key, value) -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("key=" + key + " value=" + value);
        });
        System.out.println("forEach循环遍历方式 : " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        linkedHashMap.entrySet().stream().forEach(entry -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        });
        System.out.println("entrySet().stream().forEach循环遍历方式 : " + (System.currentTimeMillis() - start) + "ms");


        start = System.currentTimeMillis();
        linkedHashMap.entrySet().parallelStream().forEach(entry -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        });
        System.out.println("entrySet().parallelStream().forEach循环遍历方式 : " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        linkedHashMap.entrySet().parallelStream().peek(System.out::println)
                .collect(Collectors.toList())
                .forEach(entry -> {
                    System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
                });
        System.out.println("entrySet().parallelStream().forEach循环遍历方式 : " + (System.currentTimeMillis() - start) + "ms");

        ArrayList<Integer> integers = new ArrayList<>();
        IntStream.rangeClosed(0, 99).forEach(integers::add);
        boolean b = integers.parallelStream().allMatch(i -> i < 100);
        System.out.println(b);

//        frcFileInfoList.parallelStream().allMatch(frcFile -> {
//                    try {
//                        return FileUploadUtils.delete(frcFile.getFileFullPath()) && super.removeById(frcFile.getId());
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
    }
}
