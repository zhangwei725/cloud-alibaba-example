package com.zw.smart.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangwei
 * @since 1.0.0
 */
@Data
@Builder
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
}
