package io.chuangshi.menu.service.impl;

import io.chuangshi.menu.entity.Menu;
import io.chuangshi.menu.mapper.MenuMapper;
import io.chuangshi.menu.service.MenuService;
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
public class MenuServiceImpl extends CoreServiceImpl<MenuMapper, Menu> implements MenuService {
	
}
