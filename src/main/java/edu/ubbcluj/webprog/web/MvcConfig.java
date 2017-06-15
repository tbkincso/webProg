package edu.ubbcluj.webprog.web;

import edu.ubbcluj.webprog.web.filter.AdminInterceptor;
import edu.ubbcluj.webprog.web.filter.CustomerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by kincso on 13.06.2017.
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"edu.ubbcluj.webprog"})
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

   @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomerInterceptor()).addPathPatterns("/customer/**");
        registry.addInterceptor(new AdminInterceptor()).addPathPatterns("/admin/**");
    }

}
