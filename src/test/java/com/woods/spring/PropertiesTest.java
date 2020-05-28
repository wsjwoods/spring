package com.woods.spring;

import com.woods.spring.model.OtherProperties;
import com.woods.spring.model.WoodsProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: wushijian
 * @Date: 2020/5/28 20:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${woods.title}")
    private String title;
    @Test
    public void testSingle() {
        Assert.assertEquals(title,"woods");
    }

    @Resource
    private WoodsProperties properties;
    @Test
    public void testMore() throws Exception {
        System.out.println("title:"+properties.getTitle());
        System.out.println("description:"+properties.getDesc());
    }

    @Resource
    private OtherProperties oProperties;
    @Test
    public void otherYml() throws Exception {
        System.out.println("title:"+oProperties.getTitle());
        System.out.println("blog:"+oProperties.getBlog());
    }

}
