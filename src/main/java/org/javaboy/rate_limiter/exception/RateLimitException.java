package org.javaboy.rate_limiter.exception;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/14 11:22
 */
public class RateLimitException extends Exception{
    public RateLimitException(String message) {
        super(message);
    }
}
