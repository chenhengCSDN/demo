package com.ylj.demo.entity;

import javax.lang.model.type.NullType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;


@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

//    @Min(value = NullType, message = "必须填写")
    private String cupsize;

    @Min(value = 18, message="未成年少女禁止入内")
    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupsize='" + cupsize + '\'' +
                ", age=" + age +
                '}';
    }
}
