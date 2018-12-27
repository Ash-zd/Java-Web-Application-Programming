package javaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.persistence.OneToOne;

/**
 * @author Ash
 */
@SpringBootApplication
public class Application extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}

