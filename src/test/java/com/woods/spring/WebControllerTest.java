package com.woods.spring;

import com.woods.spring.web.WebController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * @Author: wushijian
 * @Date: 2020/5/28 17:14
 */
@SpringBootTest
@AutoConfigureMockMvc
public class WebControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getUser() throws Exception {
        String responseString = mockMvc.perform(post("/getUser"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : " + responseString);
    }
    @Test
    public void getUsers() throws Exception {
        String responseString = mockMvc.perform(post("/getUsers"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : " + responseString);
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(post("/saveUser")
                .param("name","")
                .param("age","666")
                .param("pass","test123")
        );
    }



}
