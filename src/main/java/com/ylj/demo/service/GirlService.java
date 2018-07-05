package com.ylj.demo.service;

import com.ylj.demo.entity.Girl;
import com.ylj.demo.enums.ResultEnum;
import com.ylj.demo.exception.GirlException;
import com.ylj.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public Girl getAge(Integer id)throws Exception{
        Girl girl= girlRepository.findOne(id);
        if (girl.getAge()<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (girl.getAge()>10&&girl.getAge()<16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
        return girl;
    }
    /*
    * 通过ID去查询一个女生
    * */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
