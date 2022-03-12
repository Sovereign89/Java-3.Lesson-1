package ru.geekbrains.fruits;

import ru.geekbrains.fruits.core.Fruit;

public class Orange extends Fruit {

    public Orange() {
        this.setName("Orange");
        this.setWeight(1.5f);
        this.setType(this.getClass());
    }
}
