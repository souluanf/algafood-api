package dev.luanfernandes.algafood.controller;


import dev.luanfernandes.algafood.model.Customer;
import dev.luanfernandes.algafood.service.CustomerActivationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class MeuPrimeiroController {
    private final CustomerActivationService activationService;

    public MeuPrimeiroController(CustomerActivationService activationService) {
        this.activationService = activationService;
       log.info("MeuPrimeiroController: {}",activationService);
    }

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        var john = new Customer("john", "john@email.com", "11954875270");
        activationService.activate(john);
        return "Hello";
    }
}