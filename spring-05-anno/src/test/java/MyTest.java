import com.tongy.spring.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    User user = context.getBean("user", User.class);
    User user2 = context.getBean("user", User.class);
    System.out.println(user == user2);

  }

}
