package Point;

class Point {
    int x;
    int y;

    Point (int x, int y){
        x = 0;
        y = 0;
    }

    void setX(int n){
        x = n;
    }
    void setY(int n){
        x = n;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    void printcoordinates(int x, int y){
        System.err.println("(" + x + "," + y + ")");
    }

    void calculateDistance(int x, int y){
        float distance = (float) Math.sqrt((x*x)+(y*y));
        System.out.format("%.2f", distance);
    }
}
