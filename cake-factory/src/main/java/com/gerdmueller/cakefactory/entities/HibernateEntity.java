package com.gerdmueller.cakefactory.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter @Setter 
public abstract class HibernateEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	Long id;

    @Version
    @Column(nullable = false)
    private Integer version;  
    
    @Column (name = "created")
    @CreationTimestamp
    private Timestamp created;

    @Column (name = "updated")
    @UpdateTimestamp
    private Timestamp updated;
    
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}     
	
}
