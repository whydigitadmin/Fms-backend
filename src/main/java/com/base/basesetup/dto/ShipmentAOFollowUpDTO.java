package com.base.basesetup.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentAOFollowUpDTO {
	private Long id;
	private String docId;
	private LocalDate docDate;
	private String globalShipNo;
	private String pol;
	private String pod;
	private String jobNO;
	private LocalDate jobDate;
	private String fpod;
	private String nominatedBy;
	private String hawbNO;
	private LocalDate hawbDate;
	private String deliveryTerms;
	private String freight;
	private String mawbNo;
	private String mawbDate;
	private boolean projectCargo;
	private boolean directMaster;
	private boolean jobAssigned;
	private boolean masterFinalize;
	private String shipperInvoiceNo;
	private String billOfEntry;
	private String shipper;
	private String sAddType;
	private String sAddress;
	private String notify;
	private String nAddType;
	private String nAddress;
	private String consignee;
	private String caddType;
	private String cAddress;
	private String salesCategory;
	private String salesPerson;
	private BigDecimal totalNoOfPkgs;
	private BigDecimal totalGrtWt;
	private BigDecimal totalChWt;
	private BigDecimal totalVolWt;
	private BigDecimal totEstimationCost;
	private String shippingBill;
	private LocalDate date;
	private boolean documentReceived;
	private boolean pickUpDone;
	private boolean customsClearanceDone;
	private LocalDate documentReceiveddate;
	private LocalDate pickUpDonedate;
	private LocalDate customsClearanceDonedate;
	
	
	
	private boolean cancel;
	private String createdBy;
	private String  updatedBy;
	private String cancelRemarks;
	private Long orgId;
    private boolean active;
    
}