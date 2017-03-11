/**
 * Created by Евгений on 05.03.2017.
 */
public class Set {
    int k;
    Point[] arr;

    Set() {}

    Set(int k, Point a, Point b, Point c) {
        arr = new Point[3];
        this.k = k;
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
    }

    double Square() { // метод, возвращающий квадрат площади треульника
        double la, lb, lc, p;
        la = arr[0].distance(arr[1]); // вычисляем длинны сторон
        lb = arr[1].distance(arr[2]);
        lc = arr[2].distance(arr[0]);
        p = (la + lb + lc) / 2; // вычиляем полупериметр
        return p * (p - la) * (p - lb) * (p - lc); // считаем квадрат площади по формуле Герона
    }

    Set myCopy() {
        return new Set(k, arr[0], arr[1], arr[2]);
    }
}
