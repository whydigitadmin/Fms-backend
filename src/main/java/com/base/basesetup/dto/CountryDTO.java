package com.base.basesetup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDTO {

    private Long id;
	private String countryCode;
	private String countryName;
	private Long orgId;
	private boolean active;
	private String createdBy;
	private String updatedBy;

}
