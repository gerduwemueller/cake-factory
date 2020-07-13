package com.gerdmueller.cakefactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerdmueller.cakefactory.entities.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Long> {

	public Catalog findByShortcut(String shortcut);
	
	public Catalog findByName(String name);
	
}
