package KeyControl;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import java.io.IOException;
import java.util.ArrayList;

public final class InputCatcher {
    private final Terminal terminal;
    ArrayList<InputListener> listeners = new ArrayList<>();

    public InputCatcher() throws IOException {
        terminal = TerminalBuilder.builder().dumb(true).build();
        terminal.enterRawMode();
    }

    public void start()
    {
        new Thread(() -> {
            try {
                while (true) {
                    int ch = terminal.reader().read();
                    keyPressed(handleKey(ch));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void addListener(InputListener listener)
    {
        if(!listeners.contains(listener))
            listeners.add(listener);
    }

    private void keyPressed(KeyAction keyAction)
    {
        for(InputListener l : listeners)
        {
            l.onKeyPressed(keyAction);
        }
    }

    static KeyAction handleKey(int ch) {
        return switch (ch) {
            case 'w' -> KeyAction.UP;
            case 's' -> KeyAction.DOWN;
            case 'a' -> KeyAction.LEFT;
            case 'd' -> KeyAction.RIGHT;
            default -> KeyAction.NONE;
        };
    }
}
