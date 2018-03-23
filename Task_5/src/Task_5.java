import java.util.Scanner;

/*
                                            Задание 5
   Необходимо написать программу, которая проверяет слово на "палиндромность". Слово для проверки вводится вручную во
   время выполнения программы.


 */


public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите слово для проверки на \"палиндромность\" :");
        Scanner sc = new Scanner(System.in);
        String p_word = sc.next();
        int len = p_word.length() / 2;
        String res = "Является палиндромом";
        for (int i = 0; i < len; i++){
            if (p_word.charAt(i) != p_word.charAt(p_word.length()- 1 - i) )
                res = "Не является палиндромом";
        }
        System.out.println(res);
    }

}
