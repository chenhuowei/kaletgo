package com.fireway.kaletgo.controller;

import com.fireway.kaletgo.facade.MenuFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
@author chenhuowei
@date 2017-10-19
@description
*/
@Controller
public class IndexController {

    @Resource
    private MenuFacade menuFacade;

    @RequestMapping("index.html")
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("main.html")
    public ModelAndView main(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        mv.addObject("test","test");
        return mv;
    }

    @RequestMapping("menu.html")
    public String menu(){

        return "system/menu";
    }


}
