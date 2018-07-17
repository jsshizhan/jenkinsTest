package com.jenkins.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestCtrl {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test() {
        return "test";
    }
}
