package com.sun.admin.controller;

import com.sun.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Sun
 */
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public String adminLogin(){
        return "redirect:/login.html";
    }

}
