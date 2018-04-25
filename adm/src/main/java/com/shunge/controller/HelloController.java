package com.shunge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * created by fangshun 2018/04/25
 */

@Controller
public class HelloController {

    @RequestMapping("/adm/toHello")
    public String toIndexPage(ModelMap modelMap) {

        modelMap.put("shungege",new HelloShunGeGe().getTitle());//使用common项目里的类,并取出值

        return "/adm/hellospringboot";

    }

}
