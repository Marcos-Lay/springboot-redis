package com.example.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: demo
 * @description: Stream的创建
 * @author: Marcos-Lay
 * @create: 2019-07-22 10:20
 **/
public class TestStream {
    //通过已有集合创建Stream流
    @Test
    public void test(){
        List<String> strings = Arrays.asList("a", "b");
        Stream<String> stream = strings.stream();
        stream.forEach(s -> System.out.println(s.trim()));
    }
    //通过Stream创建Stream流
    @Test
    public void test1(){
        Stream<String> a = Stream.of("a", "b");
        a.forEach(s -> System.out.println(s.trim()));
    }
    //Stream中间操作（filter）
    @Test
    public void test3(){
        List<String> strings = Arrays.asList("a", "b","","c");
        strings.stream().filter(s -> !s.trim().equals("a")).forEach(System.out::println);
    }
    //Stream中间操作（map）
    @Test
    public void test4(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //integerStream.map( s -> s+1).forEach(System.out::println);
        List<Integer> collect = integerStream.map(s -> s + 1).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
    //Stream中间操作(skip limit)

    //Stream中间操作(sort)

}
