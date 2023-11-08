package Java_OOP_Seminar_2.HomeWork;

/**
 * Robot
 */
public class Robot extends Participants{

    //private String nameClass = "Робот";

    public Robot(String name, Integer numbPartic, int maxRun, int maxJump) {
        super(name, numbPartic, maxRun, maxJump);
    }

    @Override
    public String getNameClass() {
        return "Робот";
    }


    
}