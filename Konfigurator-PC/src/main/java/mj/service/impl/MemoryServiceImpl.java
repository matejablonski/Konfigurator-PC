package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mj.dao.impl.MemoryDaoImpl;
import mj.model.Memory;
import mj.service.MemoryService;
@Service
public class MemoryServiceImpl implements MemoryService{
	@Autowired
	private MemoryDaoImpl memoryDao;
	
	@Transactional
	public void add(Memory memory) {
		memoryDao.add(memory);
	}

	@Transactional
	public void edit(Memory memory) {
		memoryDao.edit(memory);
	}

	@Transactional
	public void delete(int memoryId) {
		memoryDao.delete(memoryId);
	}

	@Transactional
	public Memory getMemory(int memoryId) {
		return memoryDao.getMemory(memoryId);
	}

	@Transactional
	public List getAllMemory() {
		return memoryDao.getAllMemory();
	}
}
