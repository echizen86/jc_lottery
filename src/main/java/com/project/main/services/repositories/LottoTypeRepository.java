package com.project.main.services.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.services.domain.LottoType;

public interface LottoTypeRepository extends JpaRepository<LottoType, BigDecimal>{
	
	
}
