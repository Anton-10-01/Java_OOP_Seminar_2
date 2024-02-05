package Java_OOP_Seminar_2.HomeWork;

public abstract class Participants {
    private final String name;
    private final Integer id;
    private final int maxRun;
    private final int maxJump;

    public Participants(String name, Integer id, int maxRun, int maxJump) {
        this.name = name;
        this.id = id;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
    public abstract String infoPartic();
}
