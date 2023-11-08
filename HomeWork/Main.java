package Java_OOP_Seminar_2.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Домашнее задание на закрепление :
1) Создайте три класса: Человек, Кот, Робот, 
которые не наследуются от одного класса но есть общий класс родитель. 
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет */
public class Main {

    public static void main(String[] args) {
        List<Participants> partic = new ArrayList<>();
        List<Integer> let = new ArrayList<>();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        for(int i = 0; i < 3; i++) {
            treadmill.setLength(new Random().nextInt(600));
            wall.setHeight(new Random().nextInt(40));
            let.add(treadmill.getLength());
            let.add(wall.getHeight());
        }

        
        partic.add(new Human("Anton", 123, 450, 20));
        partic.add(new Cat("Vasy", 254, 500, 35));
        partic.add(new Robot("Bob", 452, 400, 25));
        partic.add(new Cat("Boris", 564, 560, 15));

        boolean f = true;

        for(int i = partic.size() - 1; i >= 0; i--) {
            for (int j = 0; j < let.size(); j += 2) {
                if(f == true){
                    if (j != let.size()) {
                        if(partic.get(i).getMaxRun() < let.get(j) || partic.get(i).getMaxJump() < let.get(j + 1)) {
                            partic.remove(partic.get(i));
                            f = false;
                        }
                    }
                }
            }
            f = true;
        }

        if (partic.isEmpty() != true) {
            for (int i = 0; i < partic.size(); i++) {
                System.out.println(partic.get(i).getNameClass() + " " + partic.get(i).getName() + " с номером: " + partic.get(i).getNumbPartic() + "\nпрошел препятствие");
            }
        } else{
            System.out.println("Никто не прошел!");
        }
    }
}