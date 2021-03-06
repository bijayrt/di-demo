package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInjectedController;
import guru.springframework.didemo.controller.SetterInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());


        System.out.println("Property    : " + ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println("Setter      : " + ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println("Constructor : " + ctx.getBean(ConstructorInjectedController.class).sayHello());

        System.out.println("--------------Fake Data Source Start !!!!--------------------");
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println("FakeDatasource -> Db Username: " + fakeDataSource.getUsername());
        System.out.println("FakeDatasource -> Db password: " + fakeDataSource.getPassword());
        System.out.println("FakeDatasource -> Db Url     : " + fakeDataSource.getUrl());

        System.out.println("--------------Fake Data Source End !!!!--------------------");
        System.out.println("--------------Fake JMS Data Source Start !!!!--------------------");
        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println("FakeJmsBroker -> Db Username: " + fakeJmsBroker.getUsername());
        System.out.println("FakeJmsBroker -> Db password: " + fakeJmsBroker.getPassword());
        System.out.println("FakeJmsBroker -> Db Url     : " + fakeJmsBroker.getUrl());

        System.out.println("--------------Fake JMS Data Source End !!!!--------------------");


    }

}
