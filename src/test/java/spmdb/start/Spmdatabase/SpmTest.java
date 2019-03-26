package spmdb.start.Spmdatabase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
@AutoConfigureMockMvc
public class SpmTest {
	
	@Autowired
	 private TestRestTemplate restTemplate;
	 
	 @LocalServerPort
	 private int port;

     private String getRootUrl() {
         return "http://localhost:" + port;
     }
     
     @Test
     public void contextLoads() {
    	 
     }

	
	
	@Test
	public void testFindAll() {
		
		  HttpHeaders headers = new HttpHeaders();
	        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
	        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/spm",
	        HttpMethod.GET, entity, String.class);  
	        assertNotNull(response.getBody());
		
		
		
		

	}

}

