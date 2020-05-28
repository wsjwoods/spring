package com.woods.spring.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: wushijian
 * @Date: 2020/5/28 20:12
 */
@Component
@ConfigurationProperties(prefix="woods")
@Data
public class WoodsProperties {
    private String title;
    private String desc;
}
