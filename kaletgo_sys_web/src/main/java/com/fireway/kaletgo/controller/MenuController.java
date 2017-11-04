package com.fireway.kaletgo.controller;

import com.fireway.kaletgo.facade.MenuFacade;
import com.fireway.kaletgo.model.Menu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: chenhuowei
 * @email: chenhuowei@outlook.com
 * @date: 2017-10-27
 * @description:
 * @modified By:
 */
@RestController
@RequestMapping("/sys/menu")
@Api("前端菜单控制器")
public class MenuController {

    @Resource
    private MenuFacade menuFacade;


    @RequestMapping(value="/navbar.html")
    @ResponseBody
    @ApiOperation(value = "请求导航菜单json数据")
    public List<Menu> selectMenuList(){

        return menuFacade.selectMenuList();

    }

}
