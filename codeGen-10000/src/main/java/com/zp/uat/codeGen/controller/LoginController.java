package com.zp.uat.codeGen.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PeterZP
 * @create 2023-10-27 11:15
 */
@RestController
public class LoginController {
    @GetMapping("user/info")
    public Object hello() {
        return new HashMap<String, Object>() {{
            put("code", 200);
            put("data", new HashMap<String, Object>() {{
                put("roles", new String[]{"admin"});
                put("introduction", "I am a super administrator");
                put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
                put("name", "Super Admin");
            }});
        }};
    }

    @PostMapping("login")
    public Object login(@RequestBody Map<String, Object> params) {
        return new HashMap<String, Object>() {{
            put("code", 200);
            put("data", new HashMap<String, Object>() {{
                put("token", "admin-token");
            }});
        }};
    }
}
