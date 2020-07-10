package com.gerdmueller.cakefactory.test.unit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gerdmueller.cakefactory.data.CakeDataService;

// Tests the service layer without persistence layer
@SpringBootTest(classes=com.gerdmueller.cakefactory.data.CakeDataService.class)
public class CakeDataServiceTest {
	
	@Autowired
	private CakeDataService cakeDataService;
	
	@Test
	@DisplayName("Checks getAll Method of CakeDataService")
	public void TestGetCakeData() {
		assertThat(cakeDataService.getAll()).hasSize(6);		
	}

}

