import java.util.ArrayList;
import java.util.List;

import animal.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal gato = new Gato("felix", "miau");

        Cachorro dog = new Cachorro("snoopy", "au au");
        dog.setNome("Scooby");
        dog.setSom("auu a a a au");
        dog.setFome(true);
        dog.setDormir(false);

        System.out.println(gato);
        System.out.println(dog);
        
        List<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(gato);

        animals.forEach(System.out::println);

        System.out.println("usando o metodo emitor som:\n");
        animals.forEach(a -> {
            System.out.println(a.emitirSom());
        });
    }
}
