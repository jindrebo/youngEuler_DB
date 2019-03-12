package spmdb.start.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spmdb.start.entity.Sporsmal;

public class SporsmalRowMapper implements RowMapper<Sporsmal> {

	@Override
	public Sporsmal mapRow(ResultSet rs, int arg1) throws SQLException {
		Sporsmal spm = new Sporsmal();
		spm.setId(rs.getInt("id"));
		spm.setNiva(rs.getInt("niva"));
		spm.setSpm(rs.getString("spm"));
		spm.setSvar(rs.getString("svar"));
		
		return spm;
	}
	
	

}
