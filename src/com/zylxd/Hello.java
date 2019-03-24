package com.zylxd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Hello {

    private static int num;
    private static final Custom c = new Custom();
    public static final int NUM = 1;


    public Hello() {
    }

    //主方法
    private static final int INITIAL_SIZE = 1;
    public static void main(String[] args) {
        //region Description
        System.out.println("hello world");
        ArrayList list1 = new ArrayList();
        Date date = new Date();
        //endregion
        list1.add(0,"123");
        System.out.println(list1);
        method1();
        int num1 = 10;
        System.out.println("num1 = " + num1);
        String[] arr = new String[]{"1","2","3","4"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public static void method1() {
        num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
            ArrayList list = new ArrayList();
            list.add(1);
            list.add(2);
            list.add(3);
            if (list == null) {
                
            }
            if (list != null) {
                
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
