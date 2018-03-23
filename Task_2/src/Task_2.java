import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
    /*
                        Задание 2
     Необходимо написать рекурсивный алгоритм, который находит числа Фибоначчи в пределах от 1 до N.
     N вводится вручную во время выполнения программы.
    */
        System.out.println("Введите N:");
        //Ввод N
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int iter = 1;


        while( fib(iter)< n){

        System.out.print(fib(iter)+ " ");
        iter++;

        }
    }
    // Вычисление последовательности Фибоначчи
    public static int fib(int number){
        if (number == 1)
            return 1;
        else if (number == 2)
            return 1;
        else
            return fib(number-1)+fib(number-2);

    }
}
