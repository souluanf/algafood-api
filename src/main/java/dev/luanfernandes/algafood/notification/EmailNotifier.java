package dev.luanfernandes.algafood.notification;

import dev.luanfernandes.algafood.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Slf4j
@Component
public class EmailNotifier implements Notifier {
    @Override
    public void notify(Customer customer, String message) {
        log.info("Notifying {} via email {} : {}", customer.getName(), customer.getEmail(), message);
    }
}