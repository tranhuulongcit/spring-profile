package info.cafetit.springprofile.config;

import info.cafetit.springprofile.bean.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevelopConfig {

    @Value("${cafeit.datasource}")
    private String datasource;

    @Bean
    public DataSource dataSource() {
        return new DataSource(datasource);
    }

}
