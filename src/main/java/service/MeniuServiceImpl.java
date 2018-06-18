package service;

import java.util.List;

import model.Patiekalas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PatiekalasDao;

@Service
public class MeniuServiceImpl implements MeniuService {
	
	@Autowired
	public PatiekalasDao patDao;
	
	@Override
	public List<Patiekalas> getAll(){
		return patDao.getAll();
	}
	
	/*@Override
	public List<Patiekalas> getPatiekalas(String name){
		return patDao.getPatiekalas(name);
	}*/
	
	@Override
	public void insert(Patiekalas pat){
		patDao.insert(pat);
	}
	
	@Override
	public void update(Patiekalas pat, int id){
		patDao.update(pat, id);
	}
	
	@Override
	public void delete(int id){
		patDao.delete(id);
	}

	@Override
	public Patiekalas getById(int id) {
		return patDao.getById(id);
	}

}
