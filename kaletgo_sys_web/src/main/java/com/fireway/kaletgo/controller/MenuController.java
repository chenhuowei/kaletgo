package com.fireway.kaletgo.controller;

import com.fireway.kaletgo.facade.MenuFacade;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author: chenhuowei
 * @email: chenhuowei@outlook.com
 * @date: 2017-10-27
 * @description:
 * @modified By:
 */
@Controller
@RequestMapping("/sys/menu")
@Api("前端菜单控制器")
public class MenuController {

    @Resource
    private MenuFacade menuFacade;



}
