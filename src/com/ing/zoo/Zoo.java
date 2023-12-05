package com.ing.zoo;

import com.ing.zoo.animal.AbstractAnimal;
import com.ing.zoo.animal.carnivore.Carnivore;
import com.ing.zoo.animal.herbivore.Herbivore;
import com.ing.zoo.animal.herbivore.Hippo;
import com.ing.zoo.animal.carnivore.Lion;
import com.ing.zoo.animal.herbivore.Monkey;
import com.ing.zoo.animal.Performable;
import com.ing.zoo.animal.omnivore.Pig;
import com.ing.zoo.animal.carnivore.Snake;
import com.ing.zoo.animal.carnivore.Tiger;
import com.ing.zoo.animal.herbivore.Zebra;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static com.ing.zoo.Command.HELLO;

public class Zoo {

    private static final String UNKNOWN_COMMAND = "Unknown command: ";

    public static void main(String[] args)
    {
        List<AbstractAnimal> abstractAnimals = new ArrayList<>();
        abstractAnimals.add(new Lion("henk"));
        abstractAnimals.add(new Hippo("elsa"));
        abstractAnimals.add(new Pig("dora"));
        abstractAnimals.add(new Tiger("wally"));
        abstractAnimals.add(new Zebra("marty"));
        abstractAnimals.add(new Monkey("ari"));
        abstractAnimals.add(new Snake("kaa"));

        Scanner scanner = new Scanner(System.in);

        String input;
        Command command;
        do {
            System.out.print("Voer uw command in: ");
            input = scanner.nextLine();
            command = Command.fromString(input);

            switch (command){
                case HELLO : sayHello(abstractAnimals, input);break;
                case GIVE_LEAVES: herbivoreEat(abstractAnimals); break;
                case GIVE_MEAT: carnivoreEat(abstractAnimals); break;
                case PERFORM_TRICK: performTrick(abstractAnimals); break;
                case EXIT: break;
                default:  System.out.println(UNKNOWN_COMMAND + input);
            }
        } while (command != Command.EXIT);
    }

    private static void sayHello(List<AbstractAnimal> abstractAnimals, String input) {
        if(input.toLowerCase().startsWith(HELLO.getValue() + " ")){
            String name = input.substring(HELLO.getValue().length() + 1);
            Optional<AbstractAnimal> animalOptional = abstractAnimals.stream()
                    .filter(animal -> animal.getName().equals(name))
                    .findFirst();
            if(animalOptional.isPresent()){
                animalOptional.get().sayHello();
            } else {
                System.out.println(UNKNOWN_COMMAND + input);
            }
        } else {
            abstractAnimals.forEach(AbstractAnimal::sayHello);
        }
    }

    private static void performTrick(List<AbstractAnimal> abstractAnimals) {
        abstractAnimals.stream()
                .filter(Performable.class::isInstance)
                .map(Performable.class::cast)
                .forEach(Performable::performTrick);
    }

    private static void carnivoreEat(List<AbstractAnimal> abstractAnimals) {
        abstractAnimals.stream()
                .filter(Carnivore.class::isInstance)
                .map(Carnivore.class::cast)
                .forEach(Carnivore::eatMeat);
    }

    private static void herbivoreEat(List<AbstractAnimal> abstractAnimals) {
        abstractAnimals.stream()
                .filter(Herbivore.class::isInstance)
                .map(Herbivore.class::cast)
                .forEach(Herbivore::eatLeaves);
    }
}
