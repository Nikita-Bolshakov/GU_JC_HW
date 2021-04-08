package lesson13;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Race {

    private CopyOnWriteArrayList<Stage> stages; // + синхронизация

    public CopyOnWriteArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new CopyOnWriteArrayList<>(Arrays.asList(stages));
    }

}