package io.chuangshi.common.config;

import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;

import io.chuangshi.common.base.CoreEntity;

/**
 * 自定义填充公共字段(创建时间、更新时间、删除标志、版本号等字段)
 * @author marcus
 *
 */
public class CommonMetaObjectHandler extends MetaObjectHandler {

    /**
     * 创建时间、更新时间、版本号、删除标志等字段为空自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //创建时间
        Object system_create_time = getFieldValByName(CoreEntity.SYSTEM_CREATE_TIME, metaObject);
        if (system_create_time == null) {
            setFieldValByName(CoreEntity.SYSTEM_CREATE_TIME, new Date(), metaObject);
        }
        //更新时间
        Object system_update_time = getFieldValByName(CoreEntity.SYSTEM_UPDATE_TIME, metaObject);
        if (system_update_time == null) {
            setFieldValByName(CoreEntity.SYSTEM_UPDATE_TIME, new Date(), metaObject);
        }
        //版本号
        Object system_version = getFieldValByName(CoreEntity.SYSTEM_VERSION, metaObject);
        if (system_version == null) {
            setFieldValByName(CoreEntity.SYSTEM_VERSION, 0, metaObject);
        }
        //删除标志
        Object system_status = getFieldValByName(CoreEntity.SYSTEM_STATUS, metaObject);
        if (system_status == null) {
            setFieldValByName(CoreEntity.SYSTEM_STATUS, false, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新时间
        Object system_update_time = getFieldValByName(CoreEntity.SYSTEM_UPDATE_TIME, metaObject);
        if (system_update_time == null) {
            setFieldValByName(CoreEntity.SYSTEM_UPDATE_TIME, new Date(), metaObject);
        }
        //版本号
        Object system_version = getFieldValByName(CoreEntity.SYSTEM_VERSION, metaObject);
        if (system_version == null) {
            setFieldValByName(CoreEntity.SYSTEM_VERSION, 0, metaObject);
        } else {
            setFieldValByName(CoreEntity.SYSTEM_VERSION, (Integer) system_version + 1, metaObject);
        }
    }
}