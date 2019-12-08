package com.zw.smart.service;

import com.zw.smart.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangwei
 * @since 1.0.0
 */
@FeignClient(value = "test-feign-provider", path = "/user")
public interface UserFeignService {
    /**
     * 保存对象
     *
     * @param user
     * @return
     */
    @PostMapping
    User save(@RequestBody User user);

    /**
     * 查看用户详情
     *
     * @param uid
     * @return
     */
    @GetMapping("/{uid}")
    User detail(@PathVariable("uid") int uid);

    /**
     * 根据token获取所有用户信息
     *
     * @param token
     * @return
     */
    @GetMapping
    List<User> users(@RequestHeader("token") String token);

}
