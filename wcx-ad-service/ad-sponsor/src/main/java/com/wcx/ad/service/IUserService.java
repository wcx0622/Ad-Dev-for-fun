package com.wcx.ad.service;

import com.wcx.ad.exception.AdException;
import com.wcx.ad.vo.CreateUserRequest;
import com.wcx.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
