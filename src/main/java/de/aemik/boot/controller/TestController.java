package de.aemik.boot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.aemik.boot.model.Data;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController{

    @RequestMapping("/test")
    @ResponseBody
    @GetMapping
    Data home() {
    		Data data = new Data("1", "egger", "bb");
    		log.info("testLog");
        return data;
    }

}