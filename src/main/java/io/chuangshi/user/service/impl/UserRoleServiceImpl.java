package io.chuangshi.user.service.impl;

import io.chuangshi.user.entity.UserRole;
import io.chuangshi.user.mapper.UserRoleMapper;
import io.chuangshi.user.service.UserRoleService;
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
public class UserRoleServiceImpl extends CoreServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
	
}
