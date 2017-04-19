package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.ImageDAO;
import riadh.gestion.dao.ImageDAOImpl;
import riadh.gestion.dao.entity.Image;

public class ImageServiceImpl implements ImageService{
	ImageDAO dao = new ImageDAOImpl();

	@Override
	public void add(Image i) {
		dao.add(i);
		
	}

	@Override
	public Image edite(Image i) {
		return dao.edite(i);
	}

	@Override
	public void delete(long id) {
		dao.delete(id);		
	}

	@Override
	public List<Image> finAll() {

		return dao.finAll();
	}

	@Override
	public Image finById(long id) {

		return dao.finById(id);
	}

}
