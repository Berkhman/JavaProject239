/**
 * Created by Евгений on 05.03.2017.
 */
public class Point {
    double x, y;

    Point () {
        // тут будет рандомное считывание(!)
    }

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point a) { // метод возвращающий расстояние между нашей и другой данной точкой
        return Math.sqrt((a.x - x) * ((a.x - x)) + (a.y - y) * (a.y - y));
    }
}
