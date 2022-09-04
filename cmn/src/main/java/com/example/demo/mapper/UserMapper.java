package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component(value="userMapper")
public interface UserMapper {

    /**
     *
     * @param username password
     * @return
     */
    public User selectUser(String username, String password);

}
