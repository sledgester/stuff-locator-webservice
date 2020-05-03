package ca.sledgester.stufflocatorwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"ca.sledgester", "org.springframework.data.jpa.convert.threeten"})
public class StuffLocatorWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuffLocatorWebserviceApplication.class, args);
    }

}
