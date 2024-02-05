package Java_OOP_Seminar_2.HomeWork;

import java.util.Random;

public class Wall {
    public Wall() {
    }

    public Integer getHeight() {
        return new Random().nextInt(40);
    }
}
