package mj.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mj.dao.GraphicsCardDao;
import mj.model.GraphicsCard;

@Repository
public class GraphicsCardDaoImpl implements GraphicsCardDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(GraphicsCard graphicsCard) {
		session.getCurrentSession().save(graphicsCard);
	}

	@Override
	public void edit(GraphicsCard graphicsCard) {
		session.getCurrentSession().update(graphicsCard);
	}

	@Override
	public void delete(int graphicsCardId) {		
		session.getCurrentSession().delete(getGraphicsCard(graphicsCardId));
	}

	@Override
	public GraphicsCard getGraphicsCard(int graphicsCardId) {
		return (GraphicsCard)session.getCurrentSession().get(GraphicsCard.class, graphicsCardId);
	}

	@Override
	public List getAllGraphicsCard() {
		return session.getCurrentSession().createQuery("from GraphicsCard").list();
	}

}
