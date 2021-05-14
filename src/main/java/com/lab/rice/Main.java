
package com.lab.rice;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Rice[] rices=Util.getRices();
        Stream.of(rices)
                .filter(r -> r.get品名().contains("日本"))
                .forEach(r -> System.out.println(r));
    }
}
