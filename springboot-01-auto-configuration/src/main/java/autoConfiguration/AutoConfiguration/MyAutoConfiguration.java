package autoConfiguration.AutoConfiguration;

import autoConfiguration.AutoConfiguration.MyServlet.MyServlet;
import autoConfiguration.AutoConfiguration.properties.MyProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfiguration {
    private MyProperties myProperties;

    //当myProperties参数使用时候，会默认把MyProperties注入到容器中
    public MyAutoConfiguration(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @Bean
    public ServletRegistrationBean myServletServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(myProperties));
        bean.addUrlMappings(myProperties.getPath());
        return bean;
    }
}
