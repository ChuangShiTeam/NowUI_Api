package io.chuangshi.user.entity.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 用户类型枚举
 * @author marcus
 *
 */
public enum UserTypeEnum implements IEnum {
    
    ADMIN("ADMIN", "管理员");

    private String value;
    private String desc;

    UserTypeEnum(final String value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Serializable getValue() {
        return this.value;
    }

    @JsonValue
    public String getDesc(){
        return this.desc;
    }
}
