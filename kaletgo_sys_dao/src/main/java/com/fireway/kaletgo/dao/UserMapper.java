package com.fireway.kaletgo.dao;

import com.fireway.kaletgo.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
@author chenhuowei
@date 2017-10-20 14:43
@params 
@description 
*/

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}