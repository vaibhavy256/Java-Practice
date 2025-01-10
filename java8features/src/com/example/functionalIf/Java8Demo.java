package com.example.functionalIf;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt= x->2*x;
        Function<Integer,Integer> tripleIt= x->3*x;
        System.out.println(doubleIt.andThen(tripleIt).apply(400));
        Consumer<Integer>consumer=x->System.out.println(x);
        consumer.accept(5);

        Predicate<Integer>predicate=x->x%2==0;
        Function<Integer,Integer>function=x->x*x;
        Consumer<Integer>consumer1=x->System.out.println(x);
        Supplier<Integer>supplier=()->100;
        if(predicate.test(supplier.get())){
            consumer1.accept(function.apply(supplier.get()));
        }
    }


}
