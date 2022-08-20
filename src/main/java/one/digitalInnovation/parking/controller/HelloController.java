/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalInnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author silas
 */
@RestController
@RequestMapping("/pinkou-braudo")
@ApiIgnore
public class HelloController {
    
    @GetMapping
    public String hello(){
        return "Um salve para o grupo Os pinkou braudo - 🍌🐟";
    }
    
}
