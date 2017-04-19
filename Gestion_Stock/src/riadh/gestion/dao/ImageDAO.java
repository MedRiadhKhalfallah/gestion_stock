package riadh.gestion.dao;

import java.util.List;

import riadh.gestion.dao.entity.Image;

public interface ImageDAO {
	
	public void add(Image i);
	public Image edite(Image i);
	public void delete(long id);
	public List<Image> finAll();
	public Image finById(long id);

}
