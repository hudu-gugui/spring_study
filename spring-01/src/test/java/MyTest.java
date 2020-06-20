import com.hudu.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
//        Student student = new Student();
//        student.setName("hudu");
        //获取ApplicationContext：拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student", Student.class);
//        System.out.println(student.getName());
        System.out.println(student);
    }
}
