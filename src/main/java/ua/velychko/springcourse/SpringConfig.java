package ua.velychko.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.velychko.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
