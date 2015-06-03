package com.mteng.controllers;

import com.mteng.services.SampleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingPageController {

    final static Logger logger = Logger.getLogger(LandingPageController.class);

    @Autowired
    SampleService service;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "This is the landing page. ";
    }

    @RequestMapping("/sample")
    @ResponseBody
    String sample() {
        return service.produceString("This is a sample input.");
    }

    @RequestMapping("/name")
    @ResponseBody
    String name() {
        logger.info("Enter name controller. ");
        return service.getName();
    }
}
