package org.javaboy.rate_limiter.controller;

import org.javaboy.rate_limiter.annotation.RateLimiter;
import org.javaboy.rate_limiter.enums.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/14 18:11
 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    @RateLimiter(time = 20, count =3, limitType = LimitType.IP)
    public String hello() {
        return "hello";
    }
}
