package com.sun.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.admin.pojo.Admin;

/**
 * AdminMapper
 * @author Sun
 */
public interface AdminMapper  extends BaseMapper<Admin> {
    /**
     * 通过管理员名获取Admin实例对象
     * @return Admin
     */
    Admin getAdminByName(String adminName);
}
