package io.chuangshi.user.service.impl;

import io.chuangshi.user.entity.User;
import io.chuangshi.user.mapper.UserMapper;
import io.chuangshi.user.service.UserService;
import io.chuangshi.common.base.impl.CoreServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author marcus
 * @since 2017-11-23
 */
@Service
public class UserServiceImpl extends CoreServiceImpl<UserMapper, User> implements UserService {
	
}
