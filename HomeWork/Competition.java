package Java_OOP_Seminar_2.HomeWork;

import java.util.List;

public class Competition {

    public Competition() {
    }
    public void winner(List<Participants> partic, List<Integer> let){
        boolean f = true;
        for(int i = partic.size() - 1; i >= 0; i--) {
            for (int j = 0; j < let.size(); j += 2) {
                if(f && (partic.get(i).getMaxRun() < let.get(j) || partic.get(i).getMaxJump() < let.get(j + 1))) {
                        partic.remove(partic.get(i));
                        f = false;
                }
            }
            f = true;
        }

        if(partic.isEmpty()) {
            System.out.println("Никто не победил!");
        } else {
            System.out.println("Победители:");
            for (Participants elem: partic) {
                System.out.println(elem.infoPartic());
            }
        }
    }
}
