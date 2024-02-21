package com.gulu.chapter11;

/**
 * @author chocolate
 * 2024/2/21 14:46
 */
public class Genericity2 {

    // todo 泛型的上下限，扩大泛型的数据类型
    public static void main(String[] args) {
        Product<Parent> product = new Product<>();
        product.product(new Message<Parent>());
        product.product(new Message<GrandPa>());
        product.product(new Message<Object>());

        Consumer<Parent> consumer = new Consumer<>();
        consumer.consumer(new Message<Parent>());
        consumer.consumer(new Message<Child>());
    }
}

class Message<T> {

}

class Product<T> {

    // 下限，类型往上找（super T是?的子类）
    public void product(Message<? super T> message) {
        System.out.println("product");
    }
}

class Consumer<T> {
    // 上限，类型往下找，保证接收到的对象功能不会丢失
    public void consumer(Message<? extends T> message) {
        System.out.println("consumer");
    }
}

class GrandPa {

}

class Parent extends GrandPa{

}

class Child extends Parent{

}
