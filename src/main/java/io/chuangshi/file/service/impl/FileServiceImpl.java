package io.chuangshi.file.service.impl;

import io.chuangshi.file.entity.File;
import io.chuangshi.file.mapper.FileMapper;
import io.chuangshi.file.service.FileService;
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
public class FileServiceImpl extends CoreServiceImpl<FileMapper, File> implements FileService {
	
}
