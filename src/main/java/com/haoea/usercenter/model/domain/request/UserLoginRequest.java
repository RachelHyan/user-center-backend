package com.haoea.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author rachelhyan
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 2019498992312690243L;

    private String userAccount;
    private String userPassword;
}
