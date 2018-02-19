package mj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Memory {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memoryId;
	@Column
	private String producer;
	@Column
	private String name;
	@Column
	private String freq;
	@Column
	private String capacity;
	@Column
	private double price;
	
	public Memory(){}
	public Memory(int memoryId, String producer, String name, String freq, String capacity, double price) {
		super();
		this.memoryId = memoryId;
		this.producer = producer;
		this.name = name;
		this.freq = freq;
		this.capacity = capacity;
		this.price = price;
	}

	public int getMemoryId() {
		return memoryId;
	}

	public void setMemoryId(int memoryId) {
		this.memoryId = memoryId;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String roducer) {
		this.producer = roducer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFreq() {
		return freq;
	}

	public void setFreq(String freq) {
		this.freq = freq;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
		
}
