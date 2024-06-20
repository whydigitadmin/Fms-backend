package com.base.basesetup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "responsibility")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsibilitiesVO {
     
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "responsibilitygen")
	@SequenceGenerator(name = "responsibilitygen", sequenceName = "responsibilityseq", initialValue = 1000000001, allocationSize = 1)
	@Column(name = "responsibilityid")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "userrolesId")
	@JsonBackReference
	private UserRolesVO userRolesVO;
}