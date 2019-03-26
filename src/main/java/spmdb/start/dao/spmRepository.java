package spmdb.start.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import spmdb.start.entity.Sporsmal;
import spmdb.start.mapper.SporsmalRowMapper;

@Repository
public interface spmRepository extends CrudRepository<Sporsmal, Integer> {
	
	
	
	 

	
	 
	

}
