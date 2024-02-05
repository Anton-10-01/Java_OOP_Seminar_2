package Java_OOP_Seminar_2.HomeWork;

public class LivePartic extends Participants{
    private final Integer age;
    public LivePartic(String name, Integer age, Integer id, int maxRun, int maxJump) {
        super(name, id, maxRun, maxJump);
        this.age = age;
    }

    @Override
    public String infoPartic() {
        return "";
    }

    public Integer getAge() {
        return age;
    }
}
