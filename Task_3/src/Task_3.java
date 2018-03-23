import java.util.Scanner;
import java.lang.Math;
public class Task_3 {

    /*
                             Задание 3
      Необходимо написать программу, которая определяет пересекаются ли два отрезка. Координаты отрезков вводятся
      вручную во время выполнения программы.

     */

    /*
    Небольшой синопсис.
     Если ограничивающие прямоугольники отрезков не имеют общих точек, то и сами отрезки не пересекаются.

      Ограничивающий прямоугольник - наименьший из прямоугольников со сторонами, параллельными осям координат, которые
    содерхат данную фигуру.

      Для отрезка p1(x1,y1)p2(x2,y2) будет прямоугольник с левым нижним углом pp1(x_min1,y_min1) и правым верхним
      углом pp2(x_max1,y_max2), где
      x_min1 = min(x1,x2)
      x_max1 = max(x1,x2)
      y_min1 = min(x1,x2)
      y_max = max(x1, x2)
      Для второго отрезка аналогично.

      Для пересечения должно выполняться условие:
      (x_max1 >= x_min2) && (x_max2 >= x_min1) && (y_max1 >= y_min2)  && (y_max2 >= y_min1)

      Если на первом этапе не удается установить, что отрезки не пересекаются, проверяем, пересекается ли каждый из
      данных отрезков с прямой, содержащей другой отрезок.  Отрезок пересекает прямую, если  его концы лежат по разные
      стороны от нее или если один из концов лежит на прямой.
        Это условие проверяется с помощью векторных произведений. Точки  p3 и p4  лежат по разные стороны от прямой p1p2
      если векторы p1p3 и p1p4 имеют различную ориентацию  относительно вектора p1p2, т.е. если знаки векторных
      произведений
      (p3 - p1)x(p2 - p1) и (p4 - p1)x(p2 - p1) различны.

      Т.е. отрезки пересекаются если:

      1)(x_max1 >= x_min2) && (x_max2 >= x_min1) && (y_max1 >= y_min2)  && (y_max2 >= y_min1)
      2) [(p3 - p1) x (p2 - p1)]*[(p4 - p1) x (p2 - p1)] <= 0
      3)[(p1 - p3) x (p4 - p3)]*[(p2 - p3) x (p4 - p3)] <= 0

      Для векторов лежащих в одной плоскости длина результирующего вектора( или площадь параллелограмма) будет равна:
      p1(x1,y1) x p2(x2, y2) = x1*y2 - x2*y1 или
          | x1  x2|
      det | y1  y1|


     */

    public static void main(String[] args) {




        // 4 точки(координаты концов отрезка)
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите координаты концов 2 отрезков.");
        System.out.println("Первый отрезок p1(x1,y1)p2(x2,y2)");
        System.out.println("Второй отрезок p3(x3,y3)p4(x4,y4)");
        System.out.println("");

        System.out.println("Ввведите координату x точки p1");
        p1.x = sc.nextInt();

        System.out.println("Ввведите координату y точки p1");
        p1.y = sc.nextInt();

        System.out.println("Ввведите координату x точки p2");
        p2.x = sc.nextInt();

        System.out.println("Ввведите координату y точки p2");
        p2.y = sc.nextInt();

        System.out.println("Ввведите координату x точки p3");
        p3.x = sc.nextInt();

        System.out.println("Ввведите координату y точки p3");
        p3.y = sc.nextInt();

        System.out.println("Ввведите координату x точки p4");
        p4.x = sc.nextInt();

        System.out.println("Ввведите координату y точки p4");
        p4.y = sc.nextInt();






        // 1 условие
        int x_min1 = Math.min(p1.x, p2.x);
        int x_max1 = Math.max(p1.x, p2.x);
        int y_min1 = Math.min(p1.y, p2.y);
        int y_max1 = Math.max(p1.y, p2.y);

        int x_min2 = Math.min(p3.x, p4.x);
        int x_max2 = Math.max(p3.x, p4.x);
        int y_min2 = Math.min(p3.y, p4.y);
        int y_max2 = Math.max(p3.y, p4.y);

        boolean rules1 = (x_max1 >= x_min2) && (x_max2 >= x_min1) && (y_max1 >= y_min2)  && (y_max2 >= y_min1);

        //[(p3 - p1) x (p2 - p1)]*[(p4 - p1) x (p2 - p1)]
        int rules2 = Point.Vector_s(Point.minus(p3,p1), Point.minus(p2,p1)) *
                Point.Vector_s(Point.minus(p4,p1), Point.minus(p2,p1) );

        //[(p1 - p3) x (p4 - p3)]*[(p2 - p3) x (p4 - p3)]
        int rules3 = Point.Vector_s(Point.minus(p1,p3), Point.minus(p4,p3))*
                Point.Vector_s(Point.minus(p2,p3),Point.minus(p4,p3));


        if (rules1 && (rules2 <= 0) && (rules3 <= 0))
            System.out.println("Отрезки пересекаются");
        else
            System.out.println("Отрезки не пересекаются");







    }



}
