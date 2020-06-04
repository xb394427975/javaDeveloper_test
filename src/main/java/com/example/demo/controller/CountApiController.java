package com.example.demo.controller;

import com.example.demo.service.CountApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping(value = "/counter-api")
public class CountApiController {
    @Autowired
    private CountApiService countApiService;

    /**
     * test with swagger: Duis,Sed,Donec,Augue,Pellentesque,123
     */
    @ResponseBody
    @PostMapping(value = "/search")
    public String search(@RequestParam(value = "searchText") List<String> searchText) {
        return countApiService.search(searchText);
    }

    @PostMapping(value = "/top/{number}")
    public void top(@PathVariable Integer number, HttpServletResponse response) {
        countApiService.top(number, response);
    }
}
