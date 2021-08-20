package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author libo.a
 * @date 2021/8/20 5:08 下午
 */
@RestController
public class ConsumerTestController {

    @Autowired
    private ConsumerTestService service;

    @GetMapping("/get")
    public Map<String, String> get() {
        Map<String, String> stringStringMap = service.get("33");
        stringStringMap.forEach((key, value) -> System.out.println(key + "==" + value));
        return null;
    }

    @GetMapping("/getlist")
    public String getList() {

        ArrayList<String> objects = new ArrayList<>();
        objects.add("a");
        objects.add("a");
        objects.add("a");
        objects.add("a");
        Request<List<String>> req = new Request<>();
        req.setData(objects);

        String formatlist = service.formatlist(req);

        return formatlist;
    }
}
