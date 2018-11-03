package lk.zeon.carrental.main;


import lk.zeon.carrental.repository.AdminRepository;
import lk.zeon.carrental.repository.CustomerRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Ze on 10/31/2018.
 */
@EnableWebMvc
@Configuration
@ComponentScan("lk.zeon.carrental")
@EnableJpaRepositories(basePackageClasses = AdminRepository.class)
@EnableTransactionManagement
public class WebAppConfig implements WebMvcConfigurer {


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
