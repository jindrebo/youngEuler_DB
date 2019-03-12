package spmdb.start.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import spmdb.start.dao.SporsmalDao;
import spmdb.start.entity.Sporsmal;

@Component
public class SporsmalServiceImpl implements SporsmalService {

	@Resource
	SporsmalDao sporsmaldao;
	
	@Override
	public List<Sporsmal> finnAlle() {
		return sporsmaldao.finnAlle();
	}

}
