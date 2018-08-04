package org.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
//        System.out.println(test.compute(2,value -> value * 3, value -> value * value));
//        System.out.println(test.compute2(2,value -> value * 3, value -> value * value));
//
//        System.out.println(test.compute3(2, value -> value + "Hello"));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> resultList = test.conditionFilter(list, conditionList ->
            conditionList.stream().filter( t -> t%2==0).collect(Collectors.toList())
        );

        System.out.println("-----------------");
        test.FilterFunction(list, t -> t%2!=0);


    }

    public int compute(int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }

    public String compute3(int a, Function<Integer,String> function1){
        return function1.apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    public List<Integer> conditionFilter(List<Integer> list, Function<List<Integer>, List<Integer>> function){
        return function.apply(list);
    }

    public void FilterFunction(List<Integer> list, Predicate<Integer> predicate){
        list.forEach( t -> {
            if(predicate.test(t)) {
                System.out.println(t);
            }
        });
    }
}
