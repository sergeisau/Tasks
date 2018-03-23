import java.util.Scanner;
/*
                          Задание 4
   Необходимо написать рекурсивный алгоритм для нахождения НОД и НОК двух чисел. Два числа вводятся вручную во время
   выполнения программы.

 */

public class Task_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число:");
        int d1 = sc.nextInt();
        System.out.println("Введите 2 число:");
        int d2 = sc.nextInt();

        int delitel = nod(d1, d2);
        System.out.println("Наибольший общий делитель " + d1 + " и " + d2 + " = " + delitel );

        int nok = (d1*d2)/nod(d1,d2);
        System.out.println("Наименьшее общее кратное " + d1 + " и " + d2 + " = " + nok);

    }

    public static int nod(int a, int b){
        if (b == 0)
            return a;
        else
            return nod(b,a%b);
    }
}
