package Streams;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Demo.run();
//        Creacion.creacion();
//        DemoMap.run();
//        DemoMap.flatMap();
//        Slice.run();
//        Sort.run();
//        Duplicates.run();
//        Reducers.run();
//        Reducers.comun();
//        Collector.run();
//        Collector.particionado();
//        Collector.grouping();
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
