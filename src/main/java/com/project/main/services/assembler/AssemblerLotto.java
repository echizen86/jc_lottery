package com.project.main.services.assembler;

import com.project.main.services.domain.Lotto;
import com.project.main.services.dto.LottoDto;

public class AssemblerLotto {
	
	public static LottoDto fromLottoToLottoDto(Lotto lotto) {
		LottoDto lottoDto = new LottoDto();
		lottoDto.setDate(lotto.getDate());
		lottoDto.setNumberOne(lotto.getNumberOne());
		lottoDto.setNumberTwo(lotto.getNumberTwo());
		lottoDto.setNumberThree(lotto.getNumberThree());
		lottoDto.setNumberFour(lotto.getNumberFour());
		lottoDto.setNumberFive(lotto.getNumberFive());
		lottoDto.setSpecialBall(lotto.getSpecialBall());
		lottoDto.setLottoType(AssemblerLottoType.fromLottoTypeToLottoTypeDto(lotto.getLottoType()));
		return lottoDto;
	}
	
	public static Lotto fromLottoDtoToLotto(LottoDto lottoDto) {
		Lotto lotto = new Lotto();
		lotto.setDate(lottoDto.getDate());
		lotto.setNumberOne(lottoDto.getNumberOne());
		lotto.setNumberTwo(lottoDto.getNumberTwo());
		lotto.setNumberThree(lottoDto.getNumberThree());
		lotto.setNumberFour(lottoDto.getNumberFour());
		lotto.setNumberFive(lottoDto.getNumberFive());
		lotto.setSpecialBall(lottoDto.getSpecialBall());
		lotto.setLottoType(AssemblerLottoType.fromLottoTypeDtoToLottoType(lottoDto.getLottoType()));
		return lotto;
	}
	

}
