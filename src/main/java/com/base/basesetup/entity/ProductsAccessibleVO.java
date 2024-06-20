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
@Table(name = "productsaccessible")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductsAccessibleVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productsaccessiblegen")
	@SequenceGenerator(name = "productsaccessiblegen", sequenceName = "productsaccessibleseq", initialValue = 1000000001, allocationSize = 1)
	@Column(name = "productsaccessibleid")
	private Long id;
	@Column(name = "productcode")
	private String productCode;
	@Column(name = "productname")
	private String productName;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	@JsonBackReference
	private UserVO userVO;
	

	
	
}