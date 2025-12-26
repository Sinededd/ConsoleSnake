public class ElementField {
    Point position;
    char view = ' ';

    ElementField(Point pos)
    {
        position = pos;
    }

    ElementField(Point pos, char symbol)
    {
        position = pos;
        view = symbol;
    }

    void setView(char symbol)
    {
        view = symbol;
    }

    void setPosition(Point pos)
    {
        position = pos;
    }
}
