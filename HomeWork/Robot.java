package Java_OOP_Seminar_2.HomeWork;

public class Robot extends Participants{

    public Robot(String name, Integer id, int maxRun, int maxJump) {
        super(name, id, maxRun, maxJump);
    }

    @Override
    public String infoPartic() {
        return "Name robot: " + getName() + "\n"
                            + "id: " + getId() + "\n"
                            + "maxRun: " + getMaxRun() + "\n"
                            + "maxJump: " + getMaxJump() + "\n";
    }
}
