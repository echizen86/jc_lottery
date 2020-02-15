package com.project.main.services.dto;

import java.math.BigDecimal;
import java.util.Date;


public class LottoDto {

	private BigDecimal id;

	private Date date;

	private Integer numberOne;

	private Integer numberTwo;

	private Integer numberThree;

	private Integer numberFour;

	private Integer numberFive;

	private Integer specialBall;

	private String lottoType;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(Integer numberOne) {
		this.numberOne = numberOne;
	}

	public Integer getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(Integer numberTwo) {
		this.numberTwo = numberTwo;
	}

	public Integer getNumberThree() {
		return numberThree;
	}

	public void setNumberThree(Integer numberThree) {
		this.numberThree = numberThree;
	}

	public Integer getNumberFour() {
		return numberFour;
	}

	public void setNumberFour(Integer numberFour) {
		this.numberFour = numberFour;
	}

	public Integer getNumberFive() {
		return numberFive;
	}

	public void setNumberFive(Integer numberFive) {
		this.numberFive = numberFive;
	}

	public Integer getSpecialBall() {
		return specialBall;
	}

	public void setSpecialBall(Integer specialBall) {
		this.specialBall = specialBall;
	}

	public String getLottoType() {
		return lottoType;
	}

	public void setLottoType(String lottoType) {
		this.lottoType = lottoType;
	}

}
