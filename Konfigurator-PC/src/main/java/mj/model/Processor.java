package mj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processor {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int processorId;
	@Column
	private String producer;
	@Column
	private String name;
	@Column
	private double price;
	
	public Processor(){}

	public Processor(int processorId, String producer, String name, double price) {
		super();
		this.processorId = processorId;
		this.producer = producer;
		this.name = name;
		this.price = price;
	}

	public int getProcessorId() {
		return processorId;
	}

	public void setProcessorId(int processorId) {
		this.processorId = processorId;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
