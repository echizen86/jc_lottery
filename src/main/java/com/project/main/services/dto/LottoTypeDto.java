package com.project.main.services.dto;

import java.math.BigDecimal;

public class LottoTypeDto {
	
	private BigDecimal lottoTypeId;
	
	private String lottoType;
	
	private String decription;

	public BigDecimal getLottoTypeId() {
		return lottoTypeId;
	}

	public void setLottoTypeId(BigDecimal lottoTypeId) {
		this.lottoTypeId = lottoTypeId;
	}

	public String getLottoType() {
		return lottoType;
	}

	public void setLottoType(String lottoType) {
		this.lottoType = lottoType;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

}
