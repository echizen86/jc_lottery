package com.project.main.services.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lotto_type")
public class LottoType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lotto_type_id")
	private BigDecimal lottoTypeId;
	
	@Column(name = "lotto_type")
	private String lottoType;
	
	@Column(name = "description")
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

	public void setDescription(String description) {
		this.description = description;
	}
	

}
