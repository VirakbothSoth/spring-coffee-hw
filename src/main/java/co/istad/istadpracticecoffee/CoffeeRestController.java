package co.istad.istadpracticecoffee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeRestController {
    private final CoffeeRepository coffeeRepository;

    public CoffeeRestController(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @GetMapping
    public List<Coffee> coffees() {
        return coffeeRepository.getAllCoffees();
    }
}
