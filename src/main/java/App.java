import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld beanCopy = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        //System.out.println(bean.getMessage());
        System.out.println(beanCopy == bean);
        System.out.println(cat1 == cat2);
    }
}