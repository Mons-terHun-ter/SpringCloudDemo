package com.example.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * @author libo.a
 * @date 2021/8/20 5:04 下午
 */
@FeignClient(name = "client-test")
@Service
public interface ConsumerTestService {

    @GetMapping("/get/{id}")
    public Map<String, String> get(@PathVariable("id") String id);

    @PostMapping("/formatlist")
    public String formatlist(@RequestBody Request<List<String>> req);
}
