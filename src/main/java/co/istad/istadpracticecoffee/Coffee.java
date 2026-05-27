package co.istad.istadpracticecoffee;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {
    // task 1 "create java POJO based on the information above, with the correct datatype"
    private String id;
    private String name;
    private double price;
    private boolean isAvailable;
}