package com.base.basesetup.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.base.basesetup.dto.CreatedUpdatedDate;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ef_sisohdr")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContainerAllocationSIVO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ef_sisohdrgen")
	@SequenceGenerator(name = "ef_sisohdrgen", sequenceName = "ef_sisohdrseq", initialValue = 1000000001, allocationSize = 1)
	@Column(name = "ef_sisohdrid")
	private Long id;
	@Column(name = "masterno")
	private String masterNo;
	@Column(name = "masterdate")
	private LocalDate masterDate;
	@Column(name = "orderno")
	private String orderNo;
	@Column(name = "orderdate")
	private LocalDate orderDate;
	@Column(name = "pkgs")
	private String pkgs;
	@Column(name = "grwt")
	private String grwt;
	
	@Column(name = "cancel")
	private boolean cancel;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "modifiedby")
	private String  updatedBy;
	@Column(name = "cancelremarks")
	private String cancelRemarks;
	@Column(name="orgid")
	private Long orgId;
	@Column(name="active")
    private boolean active;
	
	@OneToMany(mappedBy = "containerAllocationSIVO",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ContainerDetailsVO> containerDetailsVO;
	
	
	@Embedded
	private CreatedUpdatedDate commonDate = new CreatedUpdatedDate();
	
	@JsonGetter("active")
	public String getActive() {
		return active ? "Active" : "In-Active";
	}
	
}