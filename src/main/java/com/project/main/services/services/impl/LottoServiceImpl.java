package com.project.main.services.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.main.services.assembler.LottoAssembler;
import com.project.main.services.domain.Lotto;
import com.project.main.services.dto.LottoDto;
import com.project.main.services.repositories.LottoRepository;
import com.project.main.services.services.LottoService;

@Service
public class LottoServiceImpl implements LottoService {
	
	@Autowired
	LottoRepository lottoRepository;

	@Override
	public LottoDto saveLottoNumber(LottoDto lottoDto) {
		Lotto lotto = new Lotto();
		lotto = LottoAssembler.fromLottoDtoToLotto(lottoDto);
		lottoRepository.saveAndFlush(lotto);
		
		return LottoAssembler.fromLottoToLottoDto(lotto);
	}

}
