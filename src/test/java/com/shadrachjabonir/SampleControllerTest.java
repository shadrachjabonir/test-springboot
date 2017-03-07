package com.shadrachjabonir;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by shadr on 3/8/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() throws Exception {
        String body = restTemplate.getForObject("/", String.class);
        assertThat(body)
                .isEqualTo("{\"response\":\"Hello World!\"}");
    }
}
