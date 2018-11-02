package com.my.sample.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Slf4j
@SpringBootTest
@AutoConfigureMockMvc
public class SampleApiApplicationTests {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper objectMapper;

    @BeforeAll
    public static void beforeAll() {
        log.info("开始测试");
    }

    @Test
    public void contextLoads() {
        assertThat("abc").isEqualTo("abc");
    }

    @Test
    public void helloTest() throws Exception {
        String result = mvc.perform(get("/hello"))
                .andExpect(handler().methodName("hello"))
                .andExpect(status().isOk())
                // jsonPath用法参考 https://github.com/json-path/JsonPath#operators
                .andExpect(content().string("hello"))
                .andReturn().getResponse().getContentAsString();
        log.info("hello result: {}", result);
    }

    @Test
    public void pingTest() throws Exception {
        String result = mvc.perform(get("/ping"))
                .andExpect(handler().methodName("ping"))
                .andExpect(status().isOk())
                // jsonPath用法参考 https://github.com/json-path/JsonPath#operators
                .andExpect(jsonPath("$.attachment", is("PONG")))
                .andExpect(jsonPath("$.msg_code", is(200)))
                .andReturn().getResponse().getContentAsString();
        log.info("ping result: {}", result);
    }

    @AfterAll
    public static void afterAll() {
        log.info("结束测试");
    }

}
