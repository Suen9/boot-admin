package com.sun.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/basic_table")
    public String basicTable(){

        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamicTable(){

        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editableTable(){

        return "table/editable_table";
    }

    @GetMapping("/responsive_table")
    public String responsiveTable(){

        return "table/responsive_table";
    }
}
