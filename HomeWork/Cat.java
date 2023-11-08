package Java_OOP_Seminar_2.HomeWork;

/**
 * Cat
 */
public class Cat extends LiveParticipants{

    //private String nameClass = "Кот";

    public Cat(String name, Integer numbPartic, int maxRun, int maxJump){
        super(name, numbPartic, maxRun, maxJump);
    }

    @Override
    public String getNameClass() {
        return "Кот";
    }
    
    
}