package io.chuangshi.app.service.impl;

import io.chuangshi.app.entity.App;
import io.chuangshi.app.mapper.AppMapper;
import io.chuangshi.app.service.AppService;
import io.chuangshi.common.base.impl.CoreServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author marcus
 * @since 2017-11-26
 */
@Service
public class AppServiceImpl extends CoreServiceImpl<AppMapper, App> implements AppService {
	
}
