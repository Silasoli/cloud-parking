/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalInnovation.parking.controller;

import java.util.Arrays;
import java.util.List;
import one.digitalInnovation.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author silas
 */
@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll() {
        var parking = new Parking();
        parking.setColor("Preto");
        parking.setLicense("MSS-1111");
        parking.setModel("VW GOL");
        parking.setState("SP");
        return Arrays.asList(parking, parking);

    }

}
