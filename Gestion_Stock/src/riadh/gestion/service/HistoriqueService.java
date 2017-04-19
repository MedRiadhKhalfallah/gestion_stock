package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.entity.Historique;

public interface HistoriqueService {
	
	public void add(Historique h);
	public Historique edite(Historique h);
	public void delete(long id);
	public List<Historique> finAll();
	public Historique finById(long id);

}
