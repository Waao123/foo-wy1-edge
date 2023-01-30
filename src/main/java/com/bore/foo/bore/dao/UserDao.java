package com.bore.foo.bore.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bore.foo.bore.VO.ResultVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface UserDao extends BaseMapper<ResultVO> {
}
