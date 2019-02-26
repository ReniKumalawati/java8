package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<String> pets = Arrays.asList("Cat", "Dog", "Hamster", "Rabbit", "Catarpillar");

        //Predicate Example
        Predicate<String> p = (s) -> s.startsWith("C");

        //Print string in pets if fullfill predicate condition
        for (String st: pets
        ) { if (p.test(st))
            System.out.println(st);
        }

        System.out.println("==================");
        //Function Example
        Function<String, String> addString = (s) -> "I have " + s + " as pet";


        for (String st: pets) {
            System.out.println(addString.apply(st));
        }

        System.out.println("==================");
        //Consumer Example
        Consumer<String> consumeString = (s) -> System.out.println("I consumed a "+s);

        pets.forEach(consumeString);
//        for (String st: pets
//             ) { consumeString.accept(st);
//        }

        System.out.println("==================");
        //Supplier Example
        Supplier<String> supplyPet = () -> pets.get(0);

        System.out.println("My first pet is a " + (supplyPet.get()));

        System.out.println("==================");
        //Binary Operator Example
        BinaryOperator<String> addPets = (s1, s2) -> s1.replaceFirst("H","Z")+s2;

        for (int i =0; i<pets.size()-1; i++){
            System.out.println(addPets.apply(pets.get(i),pets.get(i+1)));
        }
    }
}
