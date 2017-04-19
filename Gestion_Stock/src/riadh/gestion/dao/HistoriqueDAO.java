package riadh.gestion.dao;

import java.util.List;

import riadh.gestion.dao.entity.Historique;

public interface HistoriqueDAO {
	
	public void add(Historique h);
	public Historique edite(Historique h);
	public void delete(long id);
	public List<Historique> finAll();
	public Historique finById(long id);

}
