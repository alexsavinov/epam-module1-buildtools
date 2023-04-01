package org.example;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
//            return StringUtils.isPositiveNumber(s);
//            System.out.println(s);
//            new utils;
//            StringUtils utils = new StringUtils();
//            StringUtils stringUtils = new StringUtils();
//            StringUtils stringUtils = new StringUtils();
            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }

//            new utils

        }
//        System.out.println(str.length);
        return true;
    }
}
