package com.example.demo.service;

import com.example.demo.constant.Constant;
import com.example.demo.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Service
public class CountApiService {

    public String search(List<String> searchText) {
        Map<String, Integer> nameValues = new HashMap<>(searchText.size());
        for (String s : searchText) {
            if (Constant.map.containsKey(s)) {
                nameValues.put(s, Constant.map.get(s));
            } else {
                nameValues.put(s, 0);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(nameValues.entrySet());
        Map<String, List<Map.Entry<String, Integer>>> result = new HashMap<>(1);
        result.put("counts", list);

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "error";
        }
    }

    public void top(Integer number, HttpServletResponse response) {
        try {
            String fileName = UUID.randomUUID().toString() + ".csv";
            response.setHeader("Content-type", "text/csv; charset=UTF-8");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\";charset=utf-8");
            ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
                    CsvPreference.STANDARD_PREFERENCE);
            String[] header = {"name", "count"};
            csvWriter.writeHeader(header);
            for (Map.Entry s : Constant.list) {
                User user = new User();
                user.setName(String.valueOf(s.getKey()));
                user.setCount(String.valueOf(s.getValue()));
                csvWriter.write(user, header);
                number--;
                if (number == 0) {
                    csvWriter.close();
                    return;
                }
            }
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
