package in.quallit.springboot.dbKeyEncryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class DbKeyEncryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbKeyEncryptionApplication.class, args);
	}

}
