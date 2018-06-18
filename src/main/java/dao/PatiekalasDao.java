package dao;

import java.util.List;

import model.Patiekalas;

public interface PatiekalasDao {

	List<Patiekalas> getAll();
	
	void insert(Patiekalas pat);
	
	void update(Patiekalas pat, int id);
	
	void delete(int id);
	
	Patiekalas getById(int id);
}
