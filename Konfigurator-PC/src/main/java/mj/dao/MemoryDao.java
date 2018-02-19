package mj.dao;

import java.util.List;

import mj.model.Memory;

public interface MemoryDao {
	public void add(Memory memory);
	public void edit(Memory memory);
	public void delete(int memoryId);
	public Memory getMemory(int memoryId);
	public List getAllMemory();
}