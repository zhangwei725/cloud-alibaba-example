package com.zw.smart.controller;

import com.zw.smart.entity.User;
import com.zw.smart.service.UserFeignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangwei
 * @since 1.0.0
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Resource
    UserFeignService userFeignService;

    /**
     * 传递复杂的对象 json格式
     *
     * @param user
     * @return
     */
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userFeignService.save(user);
    }

    /**
     * 127.0.0.1:8091/feign/1
     *
     * @param uid
     * @return
     */
    @GetMapping("/{uid}")
    public User detail(@PathVariable int uid) {
        return userFeignService.detail(uid);
    }

    @GetMapping()
    public List<User> users(@RequestHeader String token) {
        return userFeignService.users(token);
    }
}
