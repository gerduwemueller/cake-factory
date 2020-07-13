package com.gerdmueller.cakefactory.test.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.htmlunit.MockMvcWebConnection;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

//tests homepage with catalog fetched from persistence layer

@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureMockMvc
public class HomepageWithCatalogTest {
    
	private WebClient webClient;
	 
	@BeforeEach
	public void init() throws Exception {
	    webClient = new WebClient();
	    webClient.setWebConnection(new MockMvcWebConnection(mockMvc, webClient));
	}
	 
	@AfterEach
	public void close() throws Exception {
	    webClient.close();
	}     
	
    @Autowired
    private MockMvc mockMvc;		
	
    @Test
    @DisplayName("Tests homepage with catalog fetched from persistence layer")
    public void testHomepage() throws Exception {
    	
	    HtmlPage page = webClient.getPage("http://localhost");
	    assertThat(page.getByXPath("//h4").size()).isEqualTo(6);
    	
    }
	

}
