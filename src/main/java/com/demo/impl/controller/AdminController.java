package com.demo.impl.controller;


import com.demo.base.servcie.UserServiceAPI;
import com.demo.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lee on 2017/3/21.
 */
@Controller
@RequestMapping(value = "admin")
public class AdminController  {


    @Resource(name = "userService")
    private UserServiceAPI userServiceAPI;

    /**
     * 管理员管理--角色管理--界面显示
     * @return
     */
    @RequestMapping(value = "/admin-list")
    public ModelAndView adminRoleManage(){
        ModelAndView mv = new ModelAndView();

        List<UserEntity> userEntities = userServiceAPI.getUserList();

        mv.addObject("user",userEntities);


        mv.setViewName("admin/admin-list-manage");
        return mv;
    }

//    admin-delete
}
