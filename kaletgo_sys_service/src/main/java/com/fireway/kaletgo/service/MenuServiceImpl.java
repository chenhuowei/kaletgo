package com.fireway.kaletgo.service;

import com.fireway.kaletgo.dao.MenuMapper;
import com.fireway.kaletgo.facade.MenuFacade;
import com.fireway.kaletgo.model.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: chenhuowei
 * @email: chenhuowei@outlook.com
 * @date: 2017-10-27
 * @description:
 * @modified By:
 */
@Service
public class MenuServiceImpl implements MenuFacade{


    @Resource
    private MenuMapper menuMapper;


    /**
     * save object
     *
     * @param obj 根据泛型参数的对象
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public boolean save(Menu obj) {
        return false;
    }

    /**
     * save object where field is not blank
     *
     * @param obj 根据泛型参数的对象
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public boolean saveSelective(Menu obj) {
        return false;
    }

    /**
     * delete object by id from database
     *
     * @param id object id
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public boolean deleteById(long id) {
        return false;
    }

    /**
     * update object
     *
     * @param obj 根据泛型参数的对象
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public boolean updateById(Menu obj) {
        return false;
    }

    /**
     * update object where field where value is not blank
     *
     * @param obj 根据泛型参数的对象
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public boolean updateBySelective(Menu obj) {
        return false;
    }

    /**
     * fetch object by id from database
     *
     * @param id 根据泛型参数的对象
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public Menu get(long id) {
        return null;
    }

    /**
     * fetch data list from database
     *
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public List<Menu> list() {
        return null;
    }

    /** * desc: fetch data to menu tree
    @author chenhuowei
    @param
    @return java.util.List<com.fireway.kaletgo.model.Menu>
    
    */
    @Override
    public List<Menu> selectByPage() {
        return menuMapper.selectByPage();
    }

    /**
     * get data list from database to show
     *
     * @return boolean
     * @author chenhuowei
     */
    @Override
    public List<Menu> selectMenuList() {
        return menuMapper.selectMenuList();
    }
}
