import KeyControl.InputCatcher;

import java.io.IOException;

public final class GameController {
    private final InputCatcher inputCatcher;

    private GameController() throws IOException {
        inputCatcher = new InputCatcher();
        inputCatcher.start();
    }
    private static GameController instance;

    public static GameController getInstance() throws IOException {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void start() throws InterruptedException {
        System.out.println("Game started");
        Snake snake = new Snake(1, 1);
        inputCatcher.addListener(snake);
        while (true)
        {
            System.out.println(".");
            Thread.sleep(1000);
        }
    }
}
