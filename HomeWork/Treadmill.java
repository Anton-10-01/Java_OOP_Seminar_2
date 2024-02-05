package Java_OOP_Seminar_2.HomeWork;

import java.util.Random;

public class Treadmill {

    public Treadmill() {
    }
    public Integer getTreadmill() {
        return new Random().nextInt(300);
    }
}
