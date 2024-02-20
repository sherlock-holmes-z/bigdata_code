package com.gulu.test;

import com.gulu.chapter09.Scala_01_Exception;
import com.gulu.chapter1.HelloWord;

/**
 * @author chocolate
 * 2024/1/28 16:03
 */
public class TestScala {

    public static void main(String[] args) throws Exception {
        // 像访问静态方法一样访问scala中的方法
        HelloWord.main(args);

        // 使用@throws注解抛出异常
        Scala_01_Exception.test();
    }
}
