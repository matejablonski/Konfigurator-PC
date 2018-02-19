package mj.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mj.dao.MemoryDao;
import mj.model.Memory;

@Repository
public class MemoryDaoImpl implements MemoryDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Memory memory) {
		session.getCurrentSession().save(memory);
	}

	@Override
	public void edit(Memory memory) {
		session.getCurrentSession().update(memory);
	}

	@Override
	public void delete(int memoryId) {		
		session.getCurrentSession().delete(getMemory(memoryId));
	}

	@Override
	public Memory getMemory(int memoryId) {
		return (Memory)session.getCurrentSession().get(Memory.class, memoryId);
	}

	@Override
	public List getAllMemory() {
		return session.getCurrentSession().createQuery("from Memory").list();
	}

}
