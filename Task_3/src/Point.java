public class Point {
    int x;
    int y;
    public static Point minus(Point a, Point b){
        Point res = new Point();
        res.x = a.x - b.x;
        res.y = a.y - b.y;
        return res;

    }

    public static int Vector_s(Point a, Point b){

        int res = a.x * b.y - b.x * a.y;
        return res;

    }

}
