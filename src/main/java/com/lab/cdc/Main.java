
package com.lab.cdc;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CDC[] cdc=Util.getCdcs();
        System.out.println(cdc.length);
        Stream.of(cdc)
                //.filter(c -> c.getSent().contains("2021-05-14"))
                .filter(c -> c.getDescription().contains("美國"))
                .forEach(c -> System.out.println(c.getHeadline()+":"+c.getDescription().trim()));
    }
}
