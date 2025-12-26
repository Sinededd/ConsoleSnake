public class Cursor {
    private static final Point point = new Point(0, 0);

    public static void setCursorPosition(int x, int y) {
        if(x < 0 || y < 0)
            return;

        System.out.printf("\033[%d;%dH", x+1, y+1);
        point.setXY(x, y);
    }

    // Переместить курсор относительно текущей позиции
    public static void moveCursor(int x, int y) {
        if(getCursorPosition().getX() + x < 0 || getCursorPosition().getX() + x > 120)
            return;
        else if(getCursorPosition().getY() + y < 0 || getCursorPosition().getY() + y > 30)
            return;


        if (y > 0) {
            System.out.printf("\033[%dB", y);  // Вниз
        } else if (y < 0) {
            System.out.printf("\033[%dA", -y); // Вверх
        }

        if (x > 0) {
            System.out.printf("\033[%dC", x);  // Вправо
        } else if (x < 0) {
            System.out.printf("\033[%dD", -x); // Влево
        }

        point.moveXY(x, y);
    }


    public static Point getCursorPosition()
    {
        return point;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        point.setXY(0, 0);
    }

    public static void print(String s)
    {
        System.out.print(s);
        point.moveX(s.length());
    }

    public static void print(char c)
    {
        System.out.print(c);
        point.moveX(1);
    }


}