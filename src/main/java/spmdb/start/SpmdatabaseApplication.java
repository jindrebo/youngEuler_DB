package spmdb.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages="spmdb.start")
public class SpmdatabaseApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpmdatabaseApplication.class, args);
	}

}
