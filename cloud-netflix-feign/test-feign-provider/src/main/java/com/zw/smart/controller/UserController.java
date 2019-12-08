package com.zw.smart.controller;

import com.zw.smart.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zhangwei
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    /**
     * 模拟主键自增
     */
    private AtomicInteger pk = new AtomicInteger();

    @PostMapping
    public User save(@RequestBody User user) {
        user.setUid(pk.incrementAndGet());
        log.info(user.toString());
        return user;
    }

    /**
     *
     * @param uid
     * @return
     */
    @GetMapping("/{uid}")
    public User detail(@PathVariable("uid") int uid) {
        return User.builder()
                .uid(uid)
                .username("admin")
                .password("123456")
                .build();
    }

    @GetMapping
    public List<User> users(@RequestHeader("token") String token) {
        log.info("请求头token信息：{}", token);
        return new ArrayList<>();
    }

}
