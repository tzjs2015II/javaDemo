package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author wgl
 * @ClassName CookingDemo.java
 * @Description 函数式编程测试
 * @createTime 2019/11/18  14:24:00
 */
public class CookingDemo {

    public static void main(String[] args) {
        CookingDemo cookingDemo = new CookingDemo();
        cookingDemo.doTask("蔬菜", material -> System.out.println("清洗" + material));
        cookingDemo.doTask("蔬菜", material -> System.out.println(material + "切片"));
        cookingDemo.doTask("食用油", material -> System.out.println(material + "烧热"));
        cookingDemo.doTask("", material -> System.out.println("炒菜"));
        /*——————————————————————————————————————————————————————————————————————*/

        //lambda打印数组
        List<String> avengersRoster = Arrays.asList("iron man", "captain america", "ant man", "spider-man", "black widow", "hulk", "thor");
        avengersRoster.forEach(a -> System.out.println(a));

        /*——————————————————————————————————————————————————————————————————————*/
        //lambda表达式本身是就是一个接口的实现
        MathOperation addition = (s) -> System.out.println(s);
    }

    public void doTask(String material, Consumer<String> consumer) {
        consumer.accept(material);
    }
}
//lambda接口
@FunctionalInterface
interface MathOperation {
    void dosomeshit(String s);
}

