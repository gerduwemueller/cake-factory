package com.gerdmueller.cakefactory.test.unit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.gerdmueller.cakefactory.entities.Catalog;
import com.gerdmueller.cakefactory.repository.CatalogRepository;

@DataJpaTest
public class CatalogRepositoryTest {
	
    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private CatalogRepository catalogRepository;	
    
    @Test
    public void TestFindByShortcut() {
    
	    // given
		Catalog catalog = new Catalog("ak","Apfelkuchen",2.15);
		entityManager.persist(catalog);
		entityManager.flush();
		
	    // when
	    Catalog found = catalogRepository.findByShortcut(catalog.getShortcut());
	 
	    // then
	    assertThat(found.getShortcut())
	      .isEqualTo(catalog.getShortcut());		
	
    }
    
    @Test
    public void TestFindByName() {
    
	    // given
		Catalog catalog = new Catalog("ak","Apfelkuchen",2.15);
		entityManager.persist(catalog);
		entityManager.flush();
		
	    // when
	    Catalog found = catalogRepository.findByName(catalog.getName());
	 
	    // then
	    assertThat(found.getName())
	      .isEqualTo(catalog.getName());		
	
    }
    
    @Test
    public void testFindAll() {   	
    	
    	Catalog catalog1 = new Catalog("ak","Apfelkuchen",1.95);
    	entityManager.persist(catalog1);
    	
    	Catalog catalog2 = new Catalog("kk","Käsekuchen",2.15);
    	entityManager.persist(catalog2);
    	
    	Catalog catalog3 = new Catalog("fk","Frankfurter Kranz",2.50);
    	entityManager.persist(catalog3);
    	entityManager.flush();
   	
    	 
    	assertThat(catalogRepository.findAll()).contains(catalog1, catalog2, catalog3);    	
    	
    }
	

}
