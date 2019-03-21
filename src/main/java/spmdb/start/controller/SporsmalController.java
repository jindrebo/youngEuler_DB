package spmdb.start.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spmdb.start.dao.spmRepository;
import spmdb.start.entity.Sporsmal;


@RestController
@RequestMapping("/sporsmal")
public class SporsmalController {
	
	
	spmRepository sporsmalService;
	
	
	@Autowired
	public SporsmalController(spmRepository sporsmalService) {
		super();
		this.sporsmalService = sporsmalService;
	}



	@GetMapping (value = "/sporsmalListe")
	public Iterable<Sporsmal> getSporsmal() {
		return sporsmalService.findAll();
	}

}
