package com.ing.zoo.animal.herbivore;

import com.ing.zoo.animal.AbstractAnimal;

public abstract class AbstractHerbivore extends AbstractAnimal implements Herbivore {

    @Override
    public void eatLeaves()
    {
        System.out.println(eatText);
    }
}
