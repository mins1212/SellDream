package com.portfolio.selldream.mapper;

import java.util.List;
import java.util.Map;

import com.portfolio.selldream.vo.User;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface UserMapper {

    int insert(User vo);

    User getUser(String name);
    
    List<Map<String, Object>> list();

    Long count(long dtParam);

    int updateUser(User vo);

    int deleteUser(User vo);

}
