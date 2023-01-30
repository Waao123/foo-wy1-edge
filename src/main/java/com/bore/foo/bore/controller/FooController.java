package com.bore.foo.bore.controller;

import com.bore.foo.bore.VO.ResultVO;
import com.bore.foo.bore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class FooController {
    @Autowired
    private UserService userService;
    @GetMapping("getOne/{id}")
    public ResultVO getOne(@PathVariable Integer id){
        ResultVO one = userService.getOne(id);
        System.out.println(one);
        return one;
    }

    @GetMapping("/getAll")
    public List<ResultVO> GetAll(){
        List<ResultVO> list = userService.GetAll();
        return list;
    }

    @PostMapping
    public Integer save(@RequestBody ResultVO resultVO){
        Integer res = userService.save(resultVO);
        return res;
    }

    @GetMapping("/ageCount")
    public String ageCount(){
        String s = userService.ageCount();
        return s;
    }

    /*@GetMapping("/test")
    public String test(){
        return "hello";
    }*/
}
