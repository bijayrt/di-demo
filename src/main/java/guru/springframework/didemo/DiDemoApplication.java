package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInjectedController;
import guru.springframework.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println("Property    : "+ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println("Setter      : "+ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println("Constructor : "+ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
