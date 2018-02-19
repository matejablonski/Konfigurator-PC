package mj.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mj.dao.ProcessorDao;
import mj.model.Processor;

@Repository
public class ProcessorDaoImpl implements ProcessorDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Processor processor) {
		session.getCurrentSession().save(processor);
	}

	@Override
	public void edit(Processor processor) {
		session.getCurrentSession().update(processor);
	}

	@Override
	public void delete(int processorId) {		
		session.getCurrentSession().delete(getProcessor(processorId));
	}

	@Override
	public Processor getProcessor(int processorId) {
		return (Processor)session.getCurrentSession().get(Processor.class, processorId);
	}

	@Override
	public List getAllProcessor() {
		return session.getCurrentSession().createQuery("from Processor").list();
	}

}
