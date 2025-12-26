import java.util.ArrayList;

enum Direction {
    STOP, UP, DOWN, LEFT, RIGHT
}

public class Snake {
    ElementField head;
    ArrayList<ElementField> body = new ArrayList<ElementField>();
    Direction direction;

    Snake(){
        head = new ElementField(new Point(5, 5), '@');
        direction = Direction.STOP;
    }



}
