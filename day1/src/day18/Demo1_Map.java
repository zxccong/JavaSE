package day18;

import java.util.*;

/**
 * Map学习
 */
public class Demo1_Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        Set set =new HashSet();
        /*
        public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    通过源码看到set的add依赖的是 map的put
    可以公用一套hash的算法
         */
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);

        //第一种遍历
        for (String key : map.keySet()) {
            Integer integer = map.get(key);

        }




        //第二种遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> en = iterator.next();
            en.getKey();
            en.getValue();
        }

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            String key = en.getKey();
            Integer value = en.getValue();
        }

        //不加Map。也不报错
        //源码中看到是继承了Map.Entry<K,V>
        //static class Entry<K,V> implements Map.Entry<K,V>
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            String key = en.getKey();
            Integer value = en.getValue();
        }
    }
}

interface Inter{
    interface Inter2{
        public void show();
    }
}
//Map.Entry
class Demo implements Inter.Inter2{

    @Override
    public void show() {

    }
}
