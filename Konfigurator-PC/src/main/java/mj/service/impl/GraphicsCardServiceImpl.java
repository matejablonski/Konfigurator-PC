package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mj.dao.impl.GraphicsCardDaoImpl;
import mj.model.GraphicsCard;
import mj.service.GraphicsCardService;
@Service
public class GraphicsCardServiceImpl implements GraphicsCardService{
	@Autowired
	private GraphicsCardDaoImpl graphicsCardDao;
	
	@Transactional
	public void add(GraphicsCard graphicsCard) {
		graphicsCardDao.add(graphicsCard);
	}

	@Transactional
	public void edit(GraphicsCard graphicsCard) {
		graphicsCardDao.edit(graphicsCard);
	}

	@Transactional
	public void delete(int graphicsCardId) {
		graphicsCardDao.delete(graphicsCardId);
	}

	@Transactional
	public GraphicsCard getGraphicsCard(int graphicsCardId) {
		return graphicsCardDao.getGraphicsCard(graphicsCardId);
	}

	@Transactional
	public List getAllGraphicsCard() {
		return graphicsCardDao.getAllGraphicsCard();
	}
}
