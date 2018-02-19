package mj.service;

import java.util.List;

import mj.model.Processor;

public interface ProcessorService {
	public interface ComponentService {
		public void add(Processor student);
		public void edit(Processor student);
		public void delete(int processorId);
		public Processor getStudent(int processorId);
		public List getAllProcessor();
	}
}
