package com.bore.foo.bore.controller;

import com.bore.foo.bore.VO.ResultVO;
import com.bore.foo.bore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author huawei
 */
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
    public List<ResultVO> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public Integer save(@RequestBody ResultVO resultVO){
        return userService.save(resultVO);
    }

    @GetMapping("/ageCount")
    public String ageCount(){
        return userService.ageCount();
    }

    /*@GetMapping("/test")
    public String test(){
        return "hello";
    }*/
}
