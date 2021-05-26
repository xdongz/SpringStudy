import com.tongy.config.MyConfig;
import com.tongy.spring.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    User myUser = (User) context.getBean("myUser");
    System.out.println(myUser.getName());
  }

}
