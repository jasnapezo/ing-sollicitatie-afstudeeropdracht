package com.ing.zoo.animal.omnivore;

import com.ing.zoo.animal.Performable;

public class Pig extends AbstractOmnivore implements Performable {
    public Pig(String name)
    {
        this.name = name;
        helloText = "splash";
    }
    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        int rnd = RANDOM.nextInt(2);
        System.out.println(rnd == 0 ? "rolls in the mud" : "runs in circles");
    }
}
