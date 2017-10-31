package com.fireway.kaletgo.service;

import com.fireway.kaletgo.dao.UserMapper;
import com.fireway.kaletgo.facade.UserFacade;
import com.fireway.kaletgo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: chenhuowei
 * @email: chenhuowei@outlook.com
 * @date: 2017-10-20
 * @description:
 * @modified By:
 */
@Service
public class UserServiceImpl implements UserFacade {

    @Resource
    private UserMapper userMapper;


    @Override
    public boolean save(User obj) {
        return false;
    }

    @Override
    public boolean saveSelective(User obj) {
        return false;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public boolean updateById(User obj) {
        return false;
    }

    @Override
    public boolean updateBySelective(User obj) {
        return false;
    }

    @Override
    public User get(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> list() {
        return null;
    }
}
