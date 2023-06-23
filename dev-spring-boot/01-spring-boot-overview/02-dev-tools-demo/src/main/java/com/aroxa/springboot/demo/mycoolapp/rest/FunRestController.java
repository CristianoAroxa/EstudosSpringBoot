/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aroxa.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
        

/**
 *
 * @author crist
 */
@RestController 
public class FunRestController {
    
    // expose "/" that return "Hello World"
    
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    
}
