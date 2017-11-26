package io.chuangshi.common.util;

import java.util.HashMap;
import java.util.Map;

public class Timor {

    Map<String, Long> map = new HashMap<String, Long>();

    public void time(String label) {
        map.put(label, System.nanoTime());
    }

    public void timeEnd(String label) {
        Long start = map.get(label);
        Long end = System.nanoTime();
        System.out.printf("time label: %-20s elapsed time: (%,16.3fms)%n", label, (end - start) / 1000000.0);
    }

    public Timor() {

    }

    public Timor(String label) {
        map.put(label, System.nanoTime());
    }

    public static Timor getInstance() {
        return new Timor();
    }

    public static Timor getInstance(String label) {
        return new Timor(label);
    }

}
