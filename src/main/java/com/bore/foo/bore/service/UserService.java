package com.bore.foo.bore.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bore.foo.bore.VO.ResultVO;
import com.bore.foo.bore.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public ResultVO getOne(Integer id){
        ResultVO resultVO = userDao.selectById(id);
        System.out.println("111 "+resultVO);
        return resultVO;
    }
    public List<ResultVO> GetAll(){
        List<ResultVO> list = userDao.selectList(null);
        return list;
    }
    public Integer save(ResultVO resultVO){
        int insert = userDao.insert(resultVO);
        return insert;
    }

    public String ageCount(){
        QueryWrapper<ResultVO> lqw = new QueryWrapper<ResultVO>();
        lqw.select("sum(age) as agesSum");
        lqw.eq("sex","男");
        lqw.groupBy("sex");
        List<Map<String, Object>> list = userDao.selectMaps(lqw);
        return list.toString();
    }
}
