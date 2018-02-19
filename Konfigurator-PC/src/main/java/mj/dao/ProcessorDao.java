package mj.dao;

import java.util.List;

import mj.model.Processor;

public interface ProcessorDao {
	public void add(Processor processor);
	public void edit(Processor processor);
	public void delete(int processorId);
	public Processor getProcessor(int processorId);
	public List getAllProcessor();
}
