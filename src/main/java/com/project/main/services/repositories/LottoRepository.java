package com.project.main.services.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.main.services.domain.Lotto;

public interface LottoRepository extends JpaRepository<Lotto, BigDecimal>{
	
	@Query(value = "SELECT lotto_numbers FROM lotto_numbers INNER JOIN lotto_type ON lotto_numbers.lotto_type_id = lotto_type.lotto_type_id AND lotto_type.description = :lottoType", nativeQuery = true)
	List<Lotto> getAllLottoNumberByLottoType(@Param("lottoType") String lottoType);

}
