package spmdb.start.Spmdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="spmdb.start")
public class SpmdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmdatabaseApplication.class, args);
	}

}
