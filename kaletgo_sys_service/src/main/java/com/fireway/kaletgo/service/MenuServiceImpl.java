package com.fireway.kaletgo.service;

import com.fireway.kaletgo.dao.MenuMapper;
import com.fireway.kaletgo.facade.MenuFacade;
import com.fireway.kaletgo.model.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public boolean save(Menu obj) {
        int result = menuMapper.insert(obj);
        if (result>0) {
        	return true;
        }
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
    @Transactional
    public boolean saveSelective(Menu obj) {
        int result = menuMapper.insertSelective(obj);
        if (result>0) {
        	return true;
        }
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
    @Transactional
    public boolean deleteById(long id) {
    	int result = menuMapper.deleteByPrimaryKey(id);
    	if (result > 0) {
    		return true;
    	}
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
    @Transactional
    public boolean updateById(Menu obj) {
        
    	int result = menuMapper.updateByPrimaryKey(obj);
    	
    	if (result > 0) {
    		return true;
    	}
    	
    	
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
    @Transactional
    public boolean updateBySelective(Menu obj) {
        
    	int result = menuMapper.updateByPrimaryKeySelective(obj);
    	if (result > 0) {
        	return true;
        }
    	
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
        return menuMapper.selectByPrimaryKey(id);
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
