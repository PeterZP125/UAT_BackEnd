package com.zp.uat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author PeterZP
 * @create 2023-10-27 11:18
 */
@SpringBootApplication
@MapperScan("com.zp.uat.codeGen.mapper")
public class CodeGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeGenApplication.class, args);
    }
}
