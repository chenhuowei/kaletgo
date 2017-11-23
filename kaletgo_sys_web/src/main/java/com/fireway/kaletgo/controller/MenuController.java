package com.fireway.kaletgo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fireway.kaletgo.facade.MenuFacade;
import com.fireway.kaletgo.model.Menu;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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


    @RequestMapping(value="/navbar",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "请求导航菜单json数据",httpMethod="GET")
    public List selectMenuList(){

        List<Menu> list = menuFacade.selectMenuList();
        List<Menu> list2 = new ArrayList<Menu>();
        for(Menu menu : list){

            if (null != menu.getParentId() && menu.getParentId() !=0){
                for (Menu m : list){

                    if (m.getId() .equals( menu.getParentId() )){
                        m.getChildren().add(menu);
                    }
                }
            }else {
                list2.add(menu);
            }

        }

        return list2;

    }

    @RequestMapping(value="/list",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "请求菜单列表数据",httpMethod="GET")
    public Object list(){
        List<Menu> list = menuFacade.selectByPage();

        Map<String,Object> json = new HashMap<>();
        json.put("code", 0);
        json.put("msg", "load success");
        json.put("count", 10);
        json.put("data", list);
        return json;

    }
    
    @RequestMapping(value="/save",method=RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "保存菜单列表数据",httpMethod="PUT")
    public Object saveMenu(Menu menu){
    	
    	boolean result = menuFacade.save(menu);
    	
    	Map<String,Object> json = new HashMap<>();
    	if (result) {
    		
    		json.put("msg", "保存成功");
    		json.put("code", 0);
    	}else {
    		json.put("code", -1);
    		json.put("msg", "保存失败");
    		
    	}
    	
    	return json;
    	
    }

}
