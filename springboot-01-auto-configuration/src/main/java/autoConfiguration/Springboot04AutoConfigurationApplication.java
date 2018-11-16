package autoConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Springboot04AutoConfigurationApplication {


    public static void main(String[] args) throws  Exception {
//        Properties properties = new Properties();
//        InputStream inputStream = Application.class.getClassLoader().getResourceAsStream("classpath:/comfig.properties");
//        properties.load(inputStream);
//        SpringApplication app = new SpringApplication(Application.class);
//        app.setDefaultProperties(properties);
        SpringApplication.run(Springboot04AutoConfigurationApplication.class, args);
    }
}
