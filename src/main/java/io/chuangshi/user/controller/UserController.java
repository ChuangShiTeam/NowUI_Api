package io.chuangshi.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import io.chuangshi.user.entity.User;
import io.chuangshi.user.service.UserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author marcus
 * @since 2017-11-23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    /**
     * 分页 PAGE
     */
    @GetMapping("/test")
    public Page<User> test() {
        return userService.selectPage(new Page<User>(0, 12));
    }
    

}
