package com.woods.spring.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


/**
 * @Author: wushijian
 * @Date: 2020/5/28 17:40
 */
@Data
public class User {
    @NotEmpty(message="姓名不不能为空")
    private String name;

    @Max(value = 100, message = "年年龄不不能⼤大于100岁")
    @Min(value= 18 ,message= "必须年年满18岁！" )
    private int age;

    @NotEmpty(message="密码不不能为空")
    @Size(min=6,message="密码⻓长度不不能⼩小于6位")
    private String pass;

}
