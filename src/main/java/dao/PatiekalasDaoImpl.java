package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import mapper.PatiekalasMapper;
import model.Patiekalas;

public class PatiekalasDaoImpl implements PatiekalasDao {

	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PatiekalasDaoImpl(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Patiekalas> getAll() {
		String sql = "SELECT * FROM meniu";
		return jdbcTemplate.query(sql, new PatiekalasMapper());
	}

	@Override
	public void insert(Patiekalas pat) {
		String sql = "INSERT INTO meniu (patiekalo grupe, patiekalo pavadinimas,"
				+ " kaloriju skaicius, kaina) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, pat.getGrupe(), pat.getPavadinimas(), pat.getKalorijos(), pat.getKaina() );
		
	}

	@Override
	public void update(Patiekalas pat, int id) {
		String sql = "UPDATE meniu SET patiekalo grupe = ?, patiekalo pavadinimas = ?, kaloriju skaicius = ?, kaina = ? WHERE id =" +id;
		jdbcTemplate.update(sql, pat.getGrupe(), pat.getPavadinimas(), pat.getKalorijos(), pat.getKaina());
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM meniu WHERE id = ?";
		jdbcTemplate.update(sql, id);
		
	}

	@Override
	public Patiekalas getById(int id) {
		String sql = "SELECT * FROM meniu WHERE id = ?";
		return jdbcTemplate.queryForObject(sql,  new PatiekalasMapper(), id);
	}

}
