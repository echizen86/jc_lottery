package com.project.main.services.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lotto_numbers")
public class Lotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lotto_numbers_id")
	private BigDecimal id;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "number_one")
	private Integer numberOne;
	
	@Column(name = "number_two")
	private Integer numberTwo;
	
	@Column(name = "number_three")
	private Integer numberThree;
	
	@Column(name = "number_four")
	private Integer numberFour;
	
	@Column(name = "number_five")
	private Integer numberFive;
	
	@Column(name = "special_ball")
	private Integer specialBall;
	
	@OneToOne
	@JoinColumn(name = "lotto_type_id", referencedColumnName = "lotto_type_id")
	private LottoType lottoType;

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

	public LottoType getLottoType() {
		return lottoType;
	}

	public void setLottoType(LottoType lottoType) {
		this.lottoType = lottoType;
	}
	
	
}
