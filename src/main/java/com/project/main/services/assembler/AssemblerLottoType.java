package com.project.main.services.assembler;

import com.project.main.services.domain.LottoType;
import com.project.main.services.dto.LottoTypeDto;

public class AssemblerLottoType {
	
	public static LottoTypeDto fromLottoTypeToLottoTypeDto(LottoType lottoType) {
		LottoTypeDto lottoTypeDto = new LottoTypeDto();
		lottoTypeDto.setLottoTypeId(lottoType.getLottoTypeId());
		lottoTypeDto.setLottoType(lottoType.getLottoType());
		lottoTypeDto.setDecription(lottoType.getDescription());
		return lottoTypeDto;
	}
	
	public static LottoType fromLottoTypeDtoToLottoType(LottoTypeDto lottoTypeDto) {
		LottoType lottoType = new LottoType();
		lottoType.setLottoTypeId(lottoTypeDto.getLottoTypeId());
		lottoType.setLottoType(lottoTypeDto.getLottoType());
		lottoType.setDescription(lottoTypeDto.getDecription());
		return lottoType;
	}

}
