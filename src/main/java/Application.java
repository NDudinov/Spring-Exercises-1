import com.gridu.spring.task.Greeter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Greeter greeter = appContext.getBean("greeter", Greeter.class);
        greeter.afterPropertiesSet();
        greeter.greet();
    }
}
