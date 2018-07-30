package org.liujk.spring.cloud.ribbon.controller;

import org.liujk.spring.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello-world")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
