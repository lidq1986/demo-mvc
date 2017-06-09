package com.demo.impl.service;


import com.demo.base.dao.DBDao;
import com.demo.base.servcie.UserServiceAPI;
import com.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lee on 2017/4/15.
 */
@Service("userService")
public class UserServiceImpl implements UserServiceAPI {

    @Resource(name = "daoSupport")
    private DBDao dbDao;

    public List<UserEntity> getUserList() {
        List<UserEntity> userEntities = new ArrayList<UserEntity>();
        try {
            userEntities = (List<UserEntity>) dbDao.findForList("UserEntityMapper.getUserList",null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userEntities;
    }
}
