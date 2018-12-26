package com.power.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author jinzhimin
 * @description:
 */

@Data
@Component
public class Dog {
    private String name;
    private Integer age;
}
