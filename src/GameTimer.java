import java.util.ArrayList;

public class GameTimer {
    private final ArrayList<TickListener> listeners = new ArrayList<>();
    private final long intervalMillis;
    private boolean running = false;

    public GameTimer(long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public void addListener(TickListener listener) {
        listeners.add(listener);
    }


}
