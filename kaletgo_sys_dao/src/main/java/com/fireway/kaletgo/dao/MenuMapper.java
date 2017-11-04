package com.fireway.kaletgo.dao;

import com.fireway.kaletgo.model.Menu;

import java.util.List;

/**
@author chenhuowei
@date 2017-10-20 14:43
@params 
@description 
*/
public interface MenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu>  selectByPage();

    List<Menu> selectMenuList();

}