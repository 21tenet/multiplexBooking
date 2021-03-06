package com.cinema.dtotoentity;

import org.springframework.stereotype.Component;

import com.cinema.dto.HallCapacityDTO;
import com.cinema.entity.HallCapacity;

@Component
public class HallCapacityDtoToEntity {
	public HallCapacity convertHallCapacityDtoToEntity(HallCapacityDTO hallCapacityDTO) {
		HallCapacity hallCapacity = new HallCapacity();
		hallCapacity.setHallCapacityId(hallCapacityDTO.getHallCapacityId());
		hallCapacity.setHalls(hallCapacityDTO.getHalls());
		hallCapacity.setSeatCount(hallCapacityDTO.getHallCapacityId());
		hallCapacity.setSeatType(hallCapacityDTO.getSeatType());
		return hallCapacity;
		
		
	}

}
