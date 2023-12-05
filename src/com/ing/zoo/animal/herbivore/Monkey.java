package com.ing.zoo.animal.herbivore;

import com.ing.zoo.animal.Performable;

public class Monkey extends AbstractHerbivore implements Performable {

    public Monkey(String name)
    {
        this.name = name;
        helloText = "oe oe oe";
        eatText = "nom nom nom delicious";
    }

    public void performTrick()
    {
        int rnd = RANDOM.nextInt(2);
        System.out.println(rnd == 0 ? "walk on hands" : "grab a banana with the tail");
    }
}
