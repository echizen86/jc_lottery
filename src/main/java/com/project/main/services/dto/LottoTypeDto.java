package com.project.main.services.dto;

import java.math.BigDecimal;

public class LottoTypeDto {
	
	private BigDecimal lottoTypeId;
	
	private String lottoType;
	
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String decription) {
		this.description = decription;
	}

}
