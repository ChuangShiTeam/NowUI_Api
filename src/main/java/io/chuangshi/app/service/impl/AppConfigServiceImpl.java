package io.chuangshi.app.service.impl;

import io.chuangshi.app.entity.AppConfig;
import io.chuangshi.app.mapper.AppConfigMapper;
import io.chuangshi.app.service.AppConfigService;
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
public class AppConfigServiceImpl extends CoreServiceImpl<AppConfigMapper, AppConfig> implements AppConfigService {
	
}
