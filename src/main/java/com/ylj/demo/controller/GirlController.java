package com.ylj.demo.controller;

import com.ylj.demo.entity.Girl;
import com.ylj.demo.entity.Result;
import com.ylj.demo.repository.GirlRepository;
import com.ylj.demo.service.GirlService;
import com.ylj.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "girl")
    public List<Girl> findAll(){
        return girlRepository.findAll();
    }

    @PostMapping(value = "girl")
    public Result<Girl> insetAdd(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtil.error(0,bindingResult.getFieldError().getDefaultMessage());
        }
        Result result=ResultUtil.succes(girl);
        return result;
    }
    @GetMapping(value = "girls/getAge/{id}")
    public Girl getAge(@PathVariable("id") Integer id)throws Exception{
         return  girlService.getAge(id);
    }
}
