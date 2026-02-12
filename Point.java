package week4.geometry;

public class Point {

    private float x;
    private float y;

    
    public Point() {
        x = 0f;
        y = 0f;
    }

  
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }


    public float getY() {
        return y;
    }


    public void setY(float y) {
        this.y = y;
    }
}