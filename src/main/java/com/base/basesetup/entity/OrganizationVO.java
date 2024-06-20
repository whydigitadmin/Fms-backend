package com.base.basesetup.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.base.basesetup.dto.CreatedUpdatedDate;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "organization")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationVO {
//
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orgseqgen")
//	@SequenceGenerator(name = "orgseqgen", sequenceName = "orgseqname", initialValue = 1000000001, allocationSize = 1)
	@Column(name="organizationid")
	private Long id;
	
	@Column(name="cancel")
	private boolean cancel;
	
	@Column(name="createdby",length = 25)
	private String createdby;
	
	@Column(name="modifiedby",length = 25)
	private String modifiedby;
	
	@Column(name="name",length = 100)
	private String name;
	
	@Column(name="phone",length = 25)
	private String phoneNumber;
	
	@Column(name="street",length = 25)
	private String street;
	
	@Column(name="city",length = 25)
	private String city;
	
	@Column(name="state",length = 25)
	private String state;
	
	@Column(name="pincode",length = 25)
	private String postalCode;
	
	@Column(name="country",length = 25)
	private String country;
	
	@Column(name="logo",length = 25)
	private String orgLogo;
	
	@Column(name="code",length = 25)
	private String code;
	
	@Column(name="active")
	private boolean isActive;
	
	@Column(name="subscriptionType",length = 25)
	private String subscriptionType;
	
	@Column(name = "cancelremarks",length = 25)
	private String cancelRemarks;
	
	
	@ManyToOne
	@JoinColumn(name = "userId")
	@JsonBackReference
	private UserVO userVO;
	
	
	@Embedded
	private CreatedUpdatedDate commonDate = new CreatedUpdatedDate();

	
}