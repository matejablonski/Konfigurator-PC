package mj.dao;

import java.util.List;

import mj.model.GraphicsCard;

public interface GraphicsCardDao {
	public void add(GraphicsCard graphicsCard);
	public void edit(GraphicsCard graphicsCard);
	public void delete(int graphicsCardId);
	public GraphicsCard getGraphicsCard(int graphicsCardId);
	public List getAllGraphicsCard();
}