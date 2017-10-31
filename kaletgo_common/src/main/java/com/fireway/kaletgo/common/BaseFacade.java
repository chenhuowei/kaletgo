package com.fireway.kaletgo.common;

import java.util.List;
/**
@author chenhuowei
@date 2017-10-20 14:43
@params 
@description 
*/
public interface BaseFacade<T> {
    /**
     * save object
    @author chenhuowei
    @param obj 根据泛型参数的对象
    @return boolean
    */
    public boolean save(T obj);

    /**
     *  save object where field is not blank
    @author chenhuowei
    @param obj 根据泛型参数的对象
    @return boolean
    */
    public boolean saveSelective(T obj);

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
    public boolean updateById(T obj);

    /**
     * update object where field where value is not blank
     @author chenhuowei
     @param obj 根据泛型参数的对象
     @return boolean
     */
    public boolean updateBySelective(T obj);

    /**
     * fetch object by id from database
     @author chenhuowei
     @param id 根据泛型参数的对象
     @return boolean
     */
    public T get(long id);

    /**
     * fetch data list from database
     @author chenhuowei
     @param
     @return boolean
     */
    public List<T> list();




}
