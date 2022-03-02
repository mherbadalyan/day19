package task1;

import task1.Animal;

public class Dog extends Animal {
    @Override
    protected String voice() {
        return "Haf";
    }

    @Override
    protected String eat() {
        return "Meat";
    }

}
