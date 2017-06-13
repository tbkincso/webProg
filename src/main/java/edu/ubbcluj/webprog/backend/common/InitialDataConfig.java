package edu.ubbcluj.webprog.backend.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kincso on 13.06.2017.
 */
@Configuration
public class InitialDataConfig {
    @Bean
    public DemoDataCreator demoDataCreator() {
        return new DemoDataCreator();
    }
}
