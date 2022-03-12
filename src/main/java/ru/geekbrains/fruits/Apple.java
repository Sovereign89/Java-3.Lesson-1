package ru.geekbrains.fruits;

import ru.geekbrains.fruits.core.Fruit;

public class Apple extends Fruit {

    public Apple() {
        this.setName("Apple");
        this.setWeight(1.0f);
        this.setType(this.getClass());
    }
}
