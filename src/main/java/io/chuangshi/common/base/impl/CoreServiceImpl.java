package io.chuangshi.common.base.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.chuangshi.common.base.CoreMapper;

public class CoreServiceImpl<M extends CoreMapper<T>, T> extends ServiceImpl<M, T> {
}
