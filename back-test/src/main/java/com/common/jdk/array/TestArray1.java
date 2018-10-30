package com.common.jdk.array;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by xyj97 on 2018/10/25.
 */
public class TestArray1 {

    public static void main(String[] args) {
        String[] arr = {};
        String[] str = {"2", "3"};

       toMap();

//        System.out.println(ArrayUtils.toString(arr));


//
    }

    public static void toMap() {
        Object[] obj = new Object[3];
        System.out.println(ArrayUtils.toMap(obj));
    }

    public static void toString(String[] arr) {
        String s = ArrayUtils.toString(arr);
        System.out.println(s);
    }


}
