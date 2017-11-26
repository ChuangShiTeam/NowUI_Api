package io.chuangshi.user.service;

import io.chuangshi.Application;
import io.chuangshi.common.util.TestUtils;
import io.chuangshi.common.util.Timor;
import io.chuangshi.user.entity.User;
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
    public void selectListBySQL() throws Exception {
       /* Timor timor = new Timor("apple");
        List<User> users = userService.selectListBySQL();
        TestUtils.printList(users);
        timor.timeEnd("apple");*/
    }

}