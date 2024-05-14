package session7;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void linkedHashSetDemo() {
        // cu phap tenClass hoac  interface cua class duoc ke thua<WrapperClass> ten mang =new ten class<>();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("python");
        linkedHashSet.add("c#");
        linkedHashSet.add("html");
        linkedHashSet.add("asp.net");
        linkedHashSet.add("asp.net");//khi in ra chi lay ra gt cua 1 asp.net

        //kiem tra su ton tai tenmang.contains
        System.out.println("check exists:" + linkedHashSet.contains("java"));
        System.out.println("LinkedHashSet" + linkedHashSet);


    //lap qua cac phan tu
//    Iterator<String> iterator = linkedHashSet.iterator();
//    while(iterator.hasNext())
//
//    {
//        System.out.println(iterator.next() + " ");
//
//    }
//        Cach nhanh nhat: tenMang.forEach(System.out::println);
      linkedHashSet.forEach(System.out::println);
}
    public static void main(String[] args){
        linkedHashSetDemo();
    }
}

