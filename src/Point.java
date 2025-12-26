public class Point
{
    private int x;
    private int y;
    Point()
    {
        x = 0;
        y = 0;
    }

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
            this.x = x;
    }
    void setY(int y) {
            this.y = y;
    }

     void setXY(int x, int y) {
            this.x = x;
            this.y = y;
     }

     void moveX(int x)
     {
         this.x += x;
     }

     void moveY(int y)
     {
         this.y += y;
     }

     void moveXY(int x, int y)
     {
         this.x += x;
         this.y += y;
     }
}
