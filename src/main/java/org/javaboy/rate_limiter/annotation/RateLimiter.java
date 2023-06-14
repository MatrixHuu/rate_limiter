package org.javaboy.rate_limiter.annotation;

import org.javaboy.rate_limiter.enums.LimitType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/14 10:15
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RateLimiter {
    String key() default "rate_limit:";

    int time() default 60;

    int count() default 100;

    LimitType limitType() default LimitType.DEFAULT;
}
