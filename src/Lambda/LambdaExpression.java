package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static void main(String[] args) {
        Salutation english =  new Salutation("Hi", "English", 1);
        Salutation bahasa =  new Salutation("Hai", "Bahasa", 5);
        Salutation french = new Salutation("Bonjour", "French", 4);
        Salutation japanese = new Salutation("Konnichiwa", "Japanese", 3);
        Salutation chinese = new Salutation("Ni Hao", "Chinese", 2);
        Salutation spanish = new Salutation("Hola", "Spanish", 10);

        List<Salutation> nationalSalutation = Arrays.asList(english, bahasa, french, japanese, chinese, spanish);

        List<Salutation> top3Salutation = nationalSalutation
                .stream()
                .map(e-> {
                    if (e.getWord().equals("Hola")) {
                        e.setPriority(1);
                    }

                    return e;
                })
                .filter(salute -> salute.getPriority() <= 3)
                .collect(Collectors.toList());

        List<Salutation> str = top3Salutation
                .stream()
                .sorted(Comparator.comparingInt(Salutation::getPriority))
                .collect(Collectors.toList());

        str.forEach(e -> System.out.println(e.getWord() + ", " + e.getPriority()));
    }
}
