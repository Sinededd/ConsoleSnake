import KeyControl.InputListener;
import KeyControl.KeyAction;

import java.util.ArrayList;

enum Direction {
    STOP, UP, DOWN, LEFT, RIGHT
}

public class Snake implements InputListener {
    ElementField head;
    ArrayList<ElementField> body = new ArrayList<ElementField>();
    Direction direction;

    Snake(int x, int y){
        head = new ElementField(new Point(x, y), '@');
        direction = Direction.STOP;
    }


    @Override
    public void onKeyPressed(KeyAction keyAction) {
        switch (keyAction)
        {
            case NONE -> System.out.println("Нихуя");
            case DOWN -> System.out.println("Вниз");
            case UP -> System.out.println("Вверх");
            case LEFT -> System.out.println("Влево");
            case RIGHT -> System.out.println("Вправо");
        }
    }
}
