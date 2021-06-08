import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.gridu.spring.task"})
@PropertySource("application.properties")
public class AppConfig {

}
