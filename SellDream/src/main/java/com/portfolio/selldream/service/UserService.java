package com.portfolio.selldream.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.portfolio.selldream.mapper.UserMapper;
import com.portfolio.selldream.vo.User;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service
public class UserService extends EgovAbstractServiceImpl {

    @Resource
    UserMapper userMapper;
    
    public int insert(User vo) {
        int su = userMapper.insert(vo);
        return su;
    }

    public User getUser(String name) {
        return userMapper.getUser(name);
    }
    
    public List<Map<String, Object>> list() {
        return userMapper.list();
    }

    public int updateUser(User vo) {
    	int su = userMapper.updateUser(vo);
    	return su;
    }
    
    public int deleteUser(User vo) {
        int su = userMapper.deleteUser(vo);
        return su;
    }

}
