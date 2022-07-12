package dev.luanfernandes.algafood.service;

import dev.luanfernandes.algafood.model.Customer;
import dev.luanfernandes.algafood.notification.Notifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerActivationService {
    private final Notifier notifier;

    @Autowired
    public CustomerActivationService(Notifier notifier) {
        this.notifier = notifier;
    }
    public void activate(Customer customer) {
        customer.activate();
        notifier.notify(customer, "your registration is active.");
    }
}