package com.zp.uat.codeGen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PeterZP
 * @create 2023-10-27 11:15
 */
@RestController
@RequestMapping("oa")
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello";
    }
}
