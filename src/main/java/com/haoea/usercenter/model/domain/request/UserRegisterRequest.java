package com.haoea.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author rachelhyan
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 2019498992312690243L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
