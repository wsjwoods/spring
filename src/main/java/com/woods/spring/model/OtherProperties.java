package com.woods.spring.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: wushijian
 * @Date: 2020/5/28 20:15
 */
@Component
@ConfigurationProperties(prefix="other")
@PropertySource("classpath:other.properties")
@Data
public class OtherProperties {
    private String title;
    private String blog;
}
