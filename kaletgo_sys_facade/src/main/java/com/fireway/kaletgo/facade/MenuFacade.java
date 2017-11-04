package com.fireway.kaletgo.facade;

import com.fireway.kaletgo.model.Menu;

import java.util.List;

/**
@author chenhuowei
@date 2017-10-19 14:38
@params 
@description 
*/
public interface MenuFacade{

    /**
     * save object
     @author chenhuowei
     @param obj 根据泛型参数的对象
     @return boolean
     */
    public boolean save(Menu obj);

    /**
     *  save object where field is not blank
     @author chenhuowei
     @param obj 根据泛型参数的对象
     @return boolean
     */
    public boolean saveSelective(Menu obj);

    /**
     *   delete object by id from database
     @author chenhuowei
     @param id object id
     @return boolean
     */
    public boolean deleteById(long id);

    /**
     *  update object
     @author chenhuowei
     @param obj 根据泛型参数的对象
     @return boolean
     */
    public boolean updateById(Menu obj);

    /**
     * update object where field where value is not blank
     @author chenhuowei
     @param obj 根据泛型参数的对象
     @return boolean
     */
    public boolean updateBySelective(Menu obj);

    /**
     * fetch object by id from database
     @author chenhuowei
     @param id 根据泛型参数的对象
     @return boolean
     */
    public Menu get(long id);

    /**
     * fetch data list from database
     @author chenhuowei
     @param
     @return boolean
     */
    public List<Menu> list();
    public List<Menu>  selectByPage();
    /**
     * get data list from database to show
     @author chenhuowei
     @param
     @return boolean
     */
    public List<Menu>  selectMenuList();


}
