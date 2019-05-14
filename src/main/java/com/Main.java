import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("");
        System.out.println("Hello World!");
    }
}
