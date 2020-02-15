package com.project.main.services.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.main.services.domain.Lotto;

public interface LottoRepository extends JpaRepository<Lotto, BigDecimal>{

}
