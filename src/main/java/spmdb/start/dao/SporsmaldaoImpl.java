package spmdb.start.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import spmdb.start.entity.Sporsmal;
import spmdb.start.mapper.SporsmalRowMapper;

@Repository
public class SporsmaldaoImpl implements SporsmalDao {
	
	
	
	public SporsmaldaoImpl (NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	NamedParameterJdbcTemplate template; 

	@Override
	public List<Sporsmal> finnAlle() {
		return template.query("select * from Sporsmal", new SporsmalRowMapper());
	}
	 
	

}
