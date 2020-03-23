package com.project.main.services.services;

import java.util.Date;
import java.util.List;

import com.project.main.services.dto.LottoDto;

public interface LottoService {
	
	public LottoDto saveLottoNumber(LottoDto lottoDto);

	public List<LottoDto> getAllLottoNumbersFromLottoType(String lottoType, Date dateFrom, Date dateTo);

}
