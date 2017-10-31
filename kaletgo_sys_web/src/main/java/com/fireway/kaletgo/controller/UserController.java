package com.fireway.kaletgo.controller;

import com.fireway.kaletgo.facade.UserFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: chenhuowei
 * @email: chenhuowei@outlook.com
 * @date: 2017-10-23
 * @description:
 * @modified By:
 */
@RestController
@Api("系统用户接口")
public class UserController {

    @Resource
    private UserFacade userFacade;

    @RequestMapping(value="user/get.html",method = RequestMethod.GET)
    @ApiOperation(value="查询系统用户", notes="查询系统用户接口详细描述")
    public String get(
            @ApiParam(required=true, name="id", value="用户唯一ID")
            Long id){

        return userFacade.get(id).getAccount();
    }



}
