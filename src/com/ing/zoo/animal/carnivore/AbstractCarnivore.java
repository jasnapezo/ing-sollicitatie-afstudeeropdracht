package com.ing.zoo.animal.carnivore;

import com.ing.zoo.animal.AbstractAnimal;

public abstract class AbstractCarnivore extends AbstractAnimal implements Carnivore {

    @Override
    public void eatMeat()
    {
        System.out.println(eatText);
    }
}
