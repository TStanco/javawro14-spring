package com.sda.javawro14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourcesController {

    @GetMapping("/fragments")
    public String thymeleafFragments(){
        return "fragments";
    }

}
