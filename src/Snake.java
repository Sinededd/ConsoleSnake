import java.util.ArrayList;

enum Direction {
    STOP, UP, DOWN, LEFT, RIGHT
}

public class Snake {
    ElementField head;
    ArrayList<ElementField> body = new ArrayList<ElementField>();
    Direction direction;

    Snake(int x, int y){
        head = new ElementField(new Point(x, y), '@');
        direction = Direction.STOP;
    }


}
