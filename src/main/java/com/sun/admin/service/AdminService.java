package com.sun.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.sun.admin.pojo.Admin;

/**
 * @author Sun
 */
public interface AdminService extends IService<Admin> {
    Admin getAdminByName(String adminName);
}
