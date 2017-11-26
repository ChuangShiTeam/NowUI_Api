package io.chuangshi.common.util;

import java.util.List;

public class TestUtils {
    public static void printList(List list) {
        for (Object obj : list) {
            printObj(obj);
        }
    }

    public static void printObj(Object obj) {
        System.out.println(obj);
    }
}
