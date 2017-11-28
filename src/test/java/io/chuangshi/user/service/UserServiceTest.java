package io.chuangshi.user.service;

import io.chuangshi.Application;
import io.chuangshi.common.util.TestUtils;
import io.chuangshi.common.util.Timor;
import io.chuangshi.user.entity.User;
import io.chuangshi.user.entity.enums.UserTypeEnum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;
    
    @Test
    public void insert() throws Exception {
        Timor timor = new Timor("insert start");
        User user = new User();
        user.setAppId("22222");
        user.setObjectId("33333");
        user.setUserAccount("111111");
        user.setUserAvatar("89888");
        user.setUserEmail("33333");
        user.setUserMobile("888888");
        user.setUserName("888888");
        user.setUserPassword("123456");
        user.setUserType(UserTypeEnum.ADMIN);
        user.setWechatOpenId("888888");
        user.setWechatUnionId("99999");
        user.setSystemCreateUserId("123456");
        user.setSystemUpdateUserId("123456");
        userService.insert(user);
        timor.timeEnd("insert success");
    }
    
    @Test
    public void update() throws Exception {
        
    }

    @Test
    public void selectListBySQL() throws Exception {
       /* Timor timor = new Timor("apple");
        List<User> users = userService.selectListBySQL();
        TestUtils.printList(users);
        timor.timeEnd("apple");*/
    }

}