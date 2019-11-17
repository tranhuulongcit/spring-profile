package info.cafetit.springprofile;

import info.cafetit.springprofile.bean.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringProfileApplication.class, args);
    }

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Data source: " + dataSource.getUrl());
    }
}
