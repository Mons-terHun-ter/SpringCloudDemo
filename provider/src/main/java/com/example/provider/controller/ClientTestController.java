package com.example.provider.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author libo.a
 * @date 2021/8/20 4:48 下午
 */
@RestController
public class ClientTestController {
    @GetMapping("/get/{id}")
    public Map<String,String> get(@PathVariable("id") String id) {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("name", "li");
        map.put("from", "client-test");
        return map;
    }

    @PostMapping("/formatlist")
    public String getList(@RequestBody Request<List<String>> req) {
        return String.join(",", req.getData());
    }


}
