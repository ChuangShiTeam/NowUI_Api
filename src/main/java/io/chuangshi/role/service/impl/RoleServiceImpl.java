package io.chuangshi.role.service.impl;

import io.chuangshi.role.entity.Role;
import io.chuangshi.role.mapper.RoleMapper;
import io.chuangshi.role.service.RoleService;
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
public class RoleServiceImpl extends CoreServiceImpl<RoleMapper, Role> implements RoleService {
	
}
