package com.shadrachjabonir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shadr on 26/02/2017.
 */

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SampleController extends SpringBootServletInitializer{

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/",produces =  "application/json", method = RequestMethod.GET)
    @ResponseBody
    Test home() {
        Test t = new Test();
        t.setResponse("Hello World!");
        return t;
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SampleController.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
