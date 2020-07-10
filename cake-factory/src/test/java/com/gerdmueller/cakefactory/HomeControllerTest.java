package com.gerdmueller.cakefactory;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.gerdmueller.cakefactory.controller.HomeController;

@WebMvcTest(HomeController.class)
class HomeControllerTest {
	
    @Autowired
    private MockMvc mockMvc;	

	@Test
	@DisplayName("Checks landing page")
	public void testHomepage() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.view().name("home"))
		.andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Cake Factory Homepage")));
		
	}
}
