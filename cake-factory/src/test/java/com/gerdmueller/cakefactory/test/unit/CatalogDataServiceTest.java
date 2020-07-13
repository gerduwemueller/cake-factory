package com.gerdmueller.cakefactory.test.unit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.gerdmueller.cakefactory.data.CatalogDataService;
import com.gerdmueller.cakefactory.entities.Catalog;
import com.gerdmueller.cakefactory.repository.CatalogRepository;

// Tests the service layer without persistence layer
@SpringBootTest(classes= {CatalogDataService.class})
public class CatalogDataServiceTest {
	
	@Autowired
	private CatalogDataService cakeDataService;
	
	@MockBean
	private CatalogRepository cakeRepository;
	
	@BeforeEach
	public void setUp() {
	 
	    Mockito.when(cakeRepository.findAll())
	    	.thenReturn(
	    			Arrays.asList(
					new Catalog("kk","Käsekuchen",2.15)
					,new Catalog("ak","Apfelkuchen",2.25)
					,new Catalog("bs","Belgischer Schokokuchen",2.05)
					,new Catalog("sk","Schwarzwälder Kirsch",2.50)
					,new Catalog("fk","Frankfurter Kranz",2.35)
					,new Catalog("dw","Donauwelle",1.95)	    			
	    			));

	}
	
	@Test
	@DisplayName("Tests the service layer of cake service without persistence layer")
	public void TestGetCakeData() {
		
		assertThat(cakeDataService.getAll()).hasSize(6);
		
	}

}

