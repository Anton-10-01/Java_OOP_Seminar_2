package Java_OOP_Seminar_2.HomeWork;

public class Participants{

    protected String name;
    protected Integer numbPartic;

    protected int maxRun;
    protected int maxJump;

    private String nameClass;

    public Participants(String name, Integer numbPartic, int maxRun, int maxJump) {
        this.name = name;
        this.numbPartic = numbPartic;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public Integer getNumbPartic() {
        return numbPartic;
    }

    public Integer getMaxRun(){
        return maxRun;
    }

    public Integer getMaxJump() {
        return maxJump;
    }

    public String getNameClass() {
        return nameClass;
    }
}
