package com.power.controller;


import com.power.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinzhimin
 * @description:
 */

@RestController
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String person() {
        return person.toString();
    }
}
