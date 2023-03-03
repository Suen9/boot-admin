package com.sun.admin.controller;

import com.sun.admin.pojo.Admin;
import com.sun.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author Sun
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping({"/","/login"})
    public String login() {
        return "login";
    }

    /**
     * http://localhost:8080/login?adminName=X&adminPwd=X
     *
     * @return page
     */
    @PostMapping("/login")
    public String adminLogin(@RequestParam("adminName") String adminName,
                             @RequestParam("adminPwd") String adminPwd,
                             HttpSession session, Model model) {

        Admin admin = adminService.getAdminByName(adminName);
        if (admin != null && adminPwd.equals(admin.getAdminPwd())) {
            session.setAttribute("admin", admin);
            return "redirect:/index";
        } else {
            model.addAttribute("msg", "请检查账号密码!");
            return "/login";
        }
    }
}
