package com.ing.zoo.animal;

public abstract class AbstractAnimal {

    protected String name;
    protected String helloText;
    protected String eatText;

    public String getName(){
        return name;
    }

    public void sayHello(){
        System.out.println(helloText);
    }

}
