package com.project.main.services.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.main.services.assembler.AssemblerLotto;
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
		lotto = AssemblerLotto.fromLottoDtoToLotto(lottoDto);
		Lotto result = lottoRepository.saveAndFlush(lotto);
		
		return AssemblerLotto.fromLottoToLottoDto(result);
	}
	
	@Override
	public List<LottoDto> getAllLottoNumbersFromLottoType(String lottoType) {
		List<Lotto> lottoNumbers = lottoRepository.getAllLottoNumberByLottoType(lottoType);
		List<LottoDto> result = new ArrayList<LottoDto>();
		lottoNumbers.forEach(number -> {
			result.add(AssemblerLotto.fromLottoToLottoDto(number));
		});
		return result;
	}

}
