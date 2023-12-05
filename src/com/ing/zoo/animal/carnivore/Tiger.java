package com.ing.zoo.animal.carnivore;

import com.ing.zoo.animal.AbstractAnimal;
import com.ing.zoo.animal.Performable;

public class Tiger extends AbstractCarnivore implements Performable {

    public Tiger(String name)
    {
        this.name = name;
        helloText = "rraaarww";
        eatText = "nomnomnom oink wubalubadubdub";
    }
    @Override
    public void performTrick()
    {
        int rnd = RANDOM.nextInt(2);
        System.out.println(rnd == 0 ? "jumps in tree" : "scratches ears");
    }
}
