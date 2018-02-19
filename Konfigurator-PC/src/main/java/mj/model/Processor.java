package mj.model;

import java.math.BigDecimal;

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
	private int Id;
	@Column
	private String Producer;
	@Column
	private String Name;
	@Column
	private BigDecimal Price;
	
	public Processor(){}
	public Processor(int id, String producer, String name, BigDecimal price) {
		super();
		Id = id;
		Producer = producer;
		Name = name;
		Price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProducer() {
		return Producer;
	}
	public void setProducer(String producer) {
		Producer = producer;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	
	
}
