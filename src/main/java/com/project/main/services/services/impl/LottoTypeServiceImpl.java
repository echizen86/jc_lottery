package com.project.main.services.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.main.services.assembler.AssemblerLottoType;
import com.project.main.services.domain.LottoType;
import com.project.main.services.dto.LottoTypeDto;
import com.project.main.services.repositories.LottoTypeRepository;
import com.project.main.services.services.LottoTypeService;

@Service
public class LottoTypeServiceImpl implements LottoTypeService{
	
	@Autowired
	LottoTypeRepository lottoTypeRepository;

	@Override
	public List<LottoTypeDto> getAllLottoTypes() {
		List<LottoType> lottoTypes = lottoTypeRepository.findAll();
		List<LottoTypeDto> dto = new ArrayList<LottoTypeDto>();
		lottoTypes.forEach((type) -> {
			dto.add(AssemblerLottoType.fromLottoTypeToLottoTypeDto(type));
		});
		return dto;
	}
	
}
