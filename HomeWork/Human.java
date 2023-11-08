package Java_OOP_Seminar_2.HomeWork;

/**
 * Human
 */
public class Human extends LiveParticipants{

    //private String nameClass = "Человек";

    public Human(String name, Integer numbPartic, int maxRun, int maxJump){
        super(name, numbPartic, maxRun, maxJump);
    }

    @Override
    public String getNameClass() {
        return "Человек";
    }
}