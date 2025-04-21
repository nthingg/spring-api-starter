package com.thingg.store;

import com.thingg.store.service.OrderService;
import com.thingg.store.service.StripePaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.setPaymentService(new StripePaymentService());
        orderService.placeOrder();
    }
}
