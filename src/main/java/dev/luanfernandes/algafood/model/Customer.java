package dev.luanfernandes.algafood.model;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Customer {
    @NonNull private String name;
    @NonNull private String email;
    @NonNull private String phone;
    private Boolean active;
    public void activate() {
        this.active = true;
    }
}