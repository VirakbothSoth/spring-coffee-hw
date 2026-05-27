package co.istad.istadpracticecoffee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CoffeeConfig {
    // task 2: "create 3 different beans of coffee using java-based config & assign values"

    @Bean
    public Coffee espresso() {
        return new Coffee(
                "C001",
                "Espresso",
                2.50,
                true
        );
    }

    @Bean
    public Coffee latte() {
        return new Coffee(
                "C002",
                "Latte",
                3.75,
                true
        );
    }

    @Bean
    public Coffee cappuccino() {
        return new Coffee(
                "C003",
                "Cappuccino",
                4.00,
                false
        );
    }

    @Bean
    public ArrayList<Coffee> coffeeList(
            Coffee espresso,
            Coffee latte,
            Coffee cappuccino
    ) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(espresso);
        coffees.add(latte);
        coffees.add(cappuccino);
        return coffees;
    }
}