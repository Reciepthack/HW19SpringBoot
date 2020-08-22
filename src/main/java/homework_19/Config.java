package homework_19;

import classpathh2.H2classpath;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass({H2classpath.class})
@Configuration
public class Config {

    @Bean
    public H2classpath H2DaoImpl(){
        return new H2classpath();
    }
}
