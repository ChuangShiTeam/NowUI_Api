package io.chuangshi.resource.service.impl;

import io.chuangshi.resource.entity.Resource;
import io.chuangshi.resource.mapper.ResourceMapper;
import io.chuangshi.resource.service.ResourceService;
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
public class ResourceServiceImpl extends CoreServiceImpl<ResourceMapper, Resource> implements ResourceService {
	
}
