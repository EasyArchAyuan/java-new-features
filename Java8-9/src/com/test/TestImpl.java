package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Ayuan
 * @Description: TODO
 * @date 2022/9/30 11:59
 */
public class TestImpl implements Test {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("AAA", 19);
        map.put("BBB", 23);
        System.out.println(map);

        Map<String, String> namesMap = Map.ofEntries(
                Map.entry("1", "Lokesh"),
                Map.entry("2", "Amit"),
                Map.entry("3", "Brian"));

        //Java9:快速创建包含0~10对键值对的Map,无法进行修改
        Map<String, Integer> mapOf = Map.of("AAA", 19, "BBB", 23);
        System.out.println(mapOf);

        //注意Set中元素顺序并不一定你的添加顺序
        Set<String> set = Set.of("BBB", "CCC", "AAA");
        List<String> list = List.of("AAA", "CCC", "BBB");

    }
}
