package com.project.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.main.services.dto.LottoTypeDto;
import com.project.main.services.services.LottoTypeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/lotto-type")
public class LottoTypeController {
	
	@Autowired
	LottoTypeService lottoTypeService;
	
	@RequestMapping(value = "/lotto-types", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<LottoTypeDto> saveLottoNumber() {
		return lottoTypeService.getAllLottoTypes();
	}

}
