import org.springframework.context.ApplicationContext;
import org.springframework.context.HierarchicalMessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сравнение по ссылке beanов Helloworld = " + (bean == bean2));

        Cat beanCat =
                applicationContext.getBean(Cat.class);
        Cat beanCat2 =
                applicationContext.getBean(Cat.class);
        System.out.println("Сравнение по ссылке бинов CAT = " + (beanCat == beanCat2));
    }
}