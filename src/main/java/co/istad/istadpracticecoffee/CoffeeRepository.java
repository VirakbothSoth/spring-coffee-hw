package co.istad.istadpracticecoffee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoffeeRepository {

    private final ArrayList<Coffee> coffees;

    public CoffeeRepository(ArrayList<Coffee> coffees) {
        this.coffees = coffees;
    }

    public List<Coffee> getAllCoffees() {
        return coffees;
    }
}
