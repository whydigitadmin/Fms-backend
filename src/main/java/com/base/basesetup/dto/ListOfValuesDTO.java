package com.base.basesetup.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListOfValuesDTO {
	private Long id;
	private String code;
	private String description;
	private Long orgId;
		
	private List<ListOfValues1DTO> ListOfValues1DTO;

}