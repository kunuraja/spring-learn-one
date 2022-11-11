package com.raj.springlearnone;

import com.raj.springlearnone.service.ProtototypeScopeService;
import com.raj.springlearnone.service.SingletonScopeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnOneApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringLearnOneApplication.class, args);
        SingletonScopeService singletonScopeService1 = context.getBean(SingletonScopeService.class);
        String singletonBean1 = singletonScopeService1.getSingleton();
        System.out.println(singletonBean1);

        SingletonScopeService singletonScopeService2 = context.getBean(SingletonScopeService.class);
        String singletonBean2 = singletonScopeService2.getSingleton();
        System.out.println(singletonBean2);

        ProtototypeScopeService protototypeScopeService1 = context.getBean(ProtototypeScopeService.class);
        String prototypeBean1 = protototypeScopeService1.getProtype();
        System.out.println(prototypeBean1);

        ProtototypeScopeService protototypeScopeService2 = context.getBean(ProtototypeScopeService.class);
        String prototypeBean2 = protototypeScopeService2.getProtype();
        System.out.println(prototypeBean2);


    }

}
