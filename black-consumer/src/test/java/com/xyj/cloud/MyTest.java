package com.xyj.cloud;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.StringUtils;
import org.assertj.core.util.Lists;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by xyj97 on 2018/10/23.
 */
public class MyTest {
    public static void main(String[] args) {
        BiFunction<String, String, Boolean> stringStringBooleanBiFunction = String::startsWith;
        Boolean apply = stringStringBooleanBiFunction.apply("ttttm", "t");
        System.out.println(apply);
        List<Dto> li = Lists.newArrayList();
        List<String> collect = li.stream().map(DtoLIst::testName).collect(Collectors.toList());
        List<String> li2 = Lists.newArrayList();

    }
}
