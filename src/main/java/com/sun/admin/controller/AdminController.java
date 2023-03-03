package com.sun.admin.controller;

import com.sun.admin.pojo.Admin;
import com.sun.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Sun
 */
@Controller
//@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * http://localhost:8080/admin/login?adminName=X&adminPwd=X
     * @return page
     */
    @GetMapping("/admin/login")
    public String adminLogin(@RequestParam("adminName") String adminName,
                             @RequestParam("adminPwd") String adminPwd){
        Admin admin = adminService.getAdminByName(adminName);
        if(adminPwd.equals(admin.getAdminPwd())){
            HttpSession session = null;
            return "index";
        }
        
    }

}
