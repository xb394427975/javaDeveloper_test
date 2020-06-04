package com.example.demo.utils;

import com.example.demo.constant.Constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountUtils {

    public static Map<String, Integer> nameCount() {
        // pre data analysis
        String content = Constant.content
                .replaceAll("\n", " ")
                .replaceAll(",", "");
        String[] names = content.split(" ");
        // count
        HashMap<String, Integer> map = new HashMap<>(100);
        for (String name : names) {
            if (map.containsKey(name)) {
                Integer count = map.get(name);
                map.put(name, count + 1);
            } else {
                map.put(name, 1);
            }
        }
        return map;
    }

    public static List<Map.Entry<String, Integer>> sort(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        return list;
    }
}
