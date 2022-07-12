package dev.luanfernandes.algafood.notification;

import dev.luanfernandes.algafood.model.Customer;

public interface Notifier {
    void notify(Customer customer, String message);
}