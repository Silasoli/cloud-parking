/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalInnovation.parking.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;
import one.digitalInnovation.parking.controller.dto.ParkingDTO;
import one.digitalInnovation.parking.model.Parking;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author silas
 */
@Component
public class ParkingMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();
    
    public ParkingDTO parkingDTO(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }
    
    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return parkingList.stream().map(this::parkingDTO).collect(Collectors.toList());
    }
    
}
