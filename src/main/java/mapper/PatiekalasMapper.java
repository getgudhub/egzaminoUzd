package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Patiekalas;

import org.springframework.jdbc.core.RowMapper;

public class PatiekalasMapper implements RowMapper<Patiekalas> {

	@Override
	public Patiekalas mapRow(ResultSet rs, int rowNum) throws SQLException {
		Patiekalas pat = new Patiekalas();
		pat.setId(rs.getInt("id"));
		pat.setGrupe(rs.getString("patiekalo grupe"));
		pat.setPavadinimas(rs.getString("patiekalo pavadinimas"));
		pat.setKalorijos(rs.getInt("kaloriju skaicius"));
		pat.setKaina(rs.getDouble("kaina"));
		rs.close();
		return pat;
	}

}
