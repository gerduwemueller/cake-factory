package com.gerdmueller.cakefactory.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Catalog extends HibernateEntity {
	
    @NaturalId
    @Column(nullable = false, unique = true)	
	private String shortcut;
    
	private String name;
	private double price;
	
	public Catalog(String shortcut, String name, double price) {
		super();
		this.shortcut = shortcut;
		this.name = name;
		this.price = price;
	}	

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog)) return false;
        Catalog other= (Catalog) o;
        return Objects.equals(shortcut, other.getShortcut());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(shortcut);
    }	
	
}
