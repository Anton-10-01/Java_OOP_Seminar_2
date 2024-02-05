package Java_OOP_Seminar_2.HomeWork;

public class Cat extends LivePartic{
    public Cat(String name, Integer age, Integer id, int maxRun, int maxJump) {
        super(name, age, id, maxRun, maxJump);
    }
    @Override
    public String infoPartic() {
        return "Name cat: " + getName() + "\n"
                + "age: " + getAge() + "\n"
                + "id: " + getId() + "\n"
                + "maxRun: " + getMaxRun() + "\n"
                + "maxJump: " + getMaxJump() + "\n";
    }
}
