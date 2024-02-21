package com.gulu.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chocolate
 * 2024/2/21 14:00
 */
public class Genericity<T> {

    public T name;

    // 泛型在编译后擦除，如果有泛型上界，就修改为泛型上届，没有就修改为Object
    // 此处String和Integer的泛型上界为Object，擦除后编译两个方法一样，所以不算方法重载
//    public void test(List<String> a){
//
//    }
//
//    public void test(List<Integer> a){
//
//    }

    public static void main(String[] args) {
        // ArrayList为类型，描述外部数据的类型
        // <>中的String为泛型，约束内部数据的类型，如果初始化时没有定义泛型，就会使用通用类型Object
        // 编译时有效，运行时无效
        List<String> list = new ArrayList<String>();

        Genericity genericity = new Genericity();
        System.out.println(genericity.name);

        // 泛型在定义后才会起作用，不会对之前的代码起作用
        List temp = new ArrayList();
        temp.add(new Genericity<>());

        // 此时定义泛型，可以直接赋值其他类型的list
        List<String> list1 = temp;
        // 但是之后再添加就不能添加泛型外的类型
//        list1.add(new Genericity<>());
        System.out.println(list1);

        // 再用到这个类型时，也会报错
        System.out.println(list1.get(0).getClass());

    }
}
