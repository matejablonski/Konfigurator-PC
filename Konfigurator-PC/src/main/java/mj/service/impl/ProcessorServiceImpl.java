package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mj.dao.impl.ProcessorDaoImpl;
import mj.model.Processor;
import mj.service.ProcessorService;
@Service
public class ProcessorServiceImpl implements ProcessorService{
	@Autowired
	private ProcessorDaoImpl processorDao;
	
	@Transactional
	public void add(Processor processor) {
		processorDao.add(processor);
	}

	@Transactional
	public void edit(Processor processor) {
		processorDao.edit(processor);
	}

	@Transactional
	public void delete(int processorId) {
		processorDao.delete(processorId);
	}

	@Transactional
	public Processor getProcessor(int processorId) {
		return processorDao.getProcessor(processorId);
	}

	@Transactional
	public List getAllProcessor() {
		return processorDao.getAllProcessor();
	}
}
