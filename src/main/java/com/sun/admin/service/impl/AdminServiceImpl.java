package com.sun.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.admin.mapper.AdminMapper;
import com.sun.admin.pojo.Admin;
import com.sun.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService{
    @Autowired
    private AdminService adminService;

    @Override
    public Admin getAdminByName(String adminName) {
        return adminService.getAdminByName(adminName);
    }
}
