package dk.skat.regelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RegelApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RegelApp.class, args);
    }
}
