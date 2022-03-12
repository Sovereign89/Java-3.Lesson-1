package ru.geekbrains;

import ru.geekbrains.fruitbox.Box;
import ru.geekbrains.fruits.Apple;
import ru.geekbrains.fruits.Orange;

public class Main {

    public static Box<Apple> boxOfApples(int count)  {

        Box<Apple> boxOfApples = new Box<>(new Apple());
        boxOfApples.addFruits(count);
        System.out.println("{boxOfApples} Current amound of fruits: " + boxOfApples.getFruits());
        System.out.println("{boxOfApples} Current weight of box: " + boxOfApples.getBoxWeight());

        return boxOfApples;
    }

    public static Box<Orange> boxOfOranges(int count) {

        Box<Orange> boxOfOranges = new Box<>(new Orange());
        boxOfOranges.addFruits(3);
        System.out.println("{boxOfOranges} Current amound of fruits: " + boxOfOranges.getFruits());
        System.out.println("{boxOfOranges} Current weight of box: " + boxOfOranges.getBoxWeight());

        return boxOfOranges;
    }

    public static void main(String[] args) {

        Box<Apple> boxOfApples = boxOfApples(3);
        Box<Orange> boxOfOranges = boxOfOranges(5);
        Box<Apple> boxOfApples2 = boxOfApples(1);

        boolean compareResult = boxOfApples.compareWeight(boxOfOranges);
        System.out.println("Two boxes are equal = " + compareResult);

        boxOfApples.fillBox(boxOfApples2);
        System.out.println("{boxOfApples2} Current amound of fruits: " + boxOfApples2.getFruits());
        System.out.println("{boxOfApples2} Current weight of box: " + boxOfApples2.getBoxWeight());
        System.out.println("{boxOfApples} Current amound of fruits: " + boxOfApples.getFruits());
        System.out.println("{boxOfApples} Current weight of box: " + boxOfApples.getBoxWeight());
    }

}
