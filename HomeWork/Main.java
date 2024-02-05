package Java_OOP_Seminar_2.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Albert", 123, 200, 100);
        Human human = new Human("Anton", 25, 10, 300, 55);
        Cat cat = new Cat("Boris", 5, 25, 500, 50);
        robot.infoPartic();
        human.infoPartic();
        cat.infoPartic();

        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();
        List<Participants> participants = new ArrayList<>();
        List<Integer> let = new ArrayList<>();

        participants.add(robot);
        participants.add(human);
        participants.add(cat);

        let.add(treadmill.getTreadmill());
        let.add(wall.getHeight());
        let.add(treadmill.getTreadmill());
        let.add(wall.getHeight());
        let.add(treadmill.getTreadmill());
        let.add(wall.getHeight());

        Competition comp = new Competition();
        comp.winner(participants, let);

    }
}
