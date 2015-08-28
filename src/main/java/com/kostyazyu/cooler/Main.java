package com.kostyazyu.cooler;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        execute(() -> {
            System.out.println("Hello Cooler!");
        });
        consume(System.out::println, "Hello Cooler!");
    }

    private static void execute(Runnable runnable) {
        System.out.println("Start runner");
        runnable.run();
        System.out.println("End runner");
    }

    private static <String> void consume(Consumer<String> consumer, String out) {
        System.out.println("Start consume");
        consumer.accept(out);
        System.out.println("End consume");
    }
}
