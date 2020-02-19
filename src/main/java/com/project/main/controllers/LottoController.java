package com.project.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.main.services.dto.LottoDto;
import com.project.main.services.services.LottoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/lotto")
public class LottoController {
	
	@Autowired
	LottoService lottoService;
	
	@RequestMapping(value = "/save-lotto-number", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LottoDto saveLottoNumber(@RequestBody LottoDto lottoDto) {
		return lottoService.saveLottoNumber(lottoDto);
	}

}
