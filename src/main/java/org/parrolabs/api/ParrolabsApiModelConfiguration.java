package org.parrolabs.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan(basePackages = {"org.parrolabs.api"})
@EnableAsync
public class ParrolabsApiModelConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParrolabsApiModelConfiguration.class);
        context.close();
    }
}
