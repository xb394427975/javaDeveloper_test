package com.example.demo;

import com.example.demo.constant.Constant;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.*;

//@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void jsonTest() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Integer> names = new HashMap<>();
        names.put("Tom", 1);
        names.put("Mary", 2);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(names.entrySet());

        Map<String, List<Map.Entry<String, Integer>>> result = new HashMap<>();
        result.put("counts", list);

        String json = mapper.writeValueAsString(result);
        System.out.println(json);


    }

    @Test
    void strTest() {
        String content = Constant.content
                .replaceAll("\n", " ")
                .replaceAll(",", "");
        System.out.println(content);
    }

    @Test
    void nameCountTest() {
        // pre data analysis
        String content = Constant.content
                .replaceAll("\n", " ")
                .replaceAll(",", "");
        String[] names = content.split(" ");
        // count
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : names) {
            if (map.containsKey(name)) {
                Integer count = map.get(name);
                map.put(name, count + 1);
            } else {
                map.put(name, 1);
            }
        }
        // sort
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry s : list) {
            System.out.println(s.getKey() + "--" + s.getValue());
        }
    }

    @Test
    void authTest() {
        String auth = "admin:admin";
        String token = Base64.getEncoder().encodeToString(auth.getBytes());
        System.out.println("Basic " + token);
    }
}
