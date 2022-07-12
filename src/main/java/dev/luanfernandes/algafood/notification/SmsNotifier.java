package dev.luanfernandes.algafood.notification;

import dev.luanfernandes.algafood.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsNotifier implements Notifier {
    @Override
    public void notify(Customer customer, String message) {
        log.info("Notifying {} via SMS {} : {}", customer.getName(), customer.getPhone(), message);
    }
}