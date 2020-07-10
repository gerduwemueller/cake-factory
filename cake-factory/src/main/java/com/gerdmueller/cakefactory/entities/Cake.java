package com.gerdmueller.cakefactory.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Cake extends HibernateEntity {
	
	private String name;
	private double price;
	private String description;
	
	public Cake(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

}
