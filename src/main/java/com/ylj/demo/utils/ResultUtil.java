package com.ylj.demo.utils;

import com.ylj.demo.entity.Result;

import javax.validation.constraints.Null;

public class ResultUtil {
    public static Result succes(Object object){
        Result result=new Result();
        result.setMsg("成功");
        result.setCode(0);
        result.setData(object);
        return result;
    }
    public static Result succes(){
        return succes(null);
    }

    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
