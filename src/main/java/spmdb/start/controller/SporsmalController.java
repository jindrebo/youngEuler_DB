package spmdb.start.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spmdb.start.entity.Sporsmal;
import spmdb.start.service.SporsmalService;

@RestController
@RequestMapping("/sporsmal")
public class SporsmalController {
	
	@Resource
	SporsmalService sporsmalService;
	
	@GetMapping (value = "/sporsmalListe")
	public List<Sporsmal> getSporsmal() {
		return sporsmalService.finnAlle();
	}

}
