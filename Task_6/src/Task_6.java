import  java.util.Scanner;
import java.lang.String;
/*
                                 Задание 6
 Необходимо написать программу, которая удаляет из текста числа. Текст вводится вручную во время выполнения  программы

 */

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner sc = new Scanner(System.in);
        String s_text = sc.nextLine();


        String res = s_text.replaceAll("(\\d+[.,]\\d+|\\d+)" , "");

        System.out.println("Текст без чисел:");
        System.out.println(res);



    }

}
