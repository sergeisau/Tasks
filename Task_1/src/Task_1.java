import java.util.Arrays;
import java.util.Scanner;


public class Task_1 {

/*                             Задание 1
      Необходимо написать программу, которая вычислыет простые числа
      в пределах от 1 до N. N-вводится вручную во время выполнения программы.
*/


        public static void main(String[] args) {
            System.out.println("Введите N:");
            //Ввод N
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Sieve_of_Eratosthenes(n);




        }


        //Решето Эратосфена


         public static void Sieve_of_Eratosthenes(int d){
           boolean arr[] = new boolean[d];
           Arrays.fill(arr, true);
           arr[0] = arr[1]=false;
           for (int i = 2; i < arr.length; ++i){
               if (arr[i]){
                   for(int j = 2; i*j < arr.length; ++j){
                       arr[i*j]=false;
                   }
               }
           }
           System.out.println("Простые числа в пределах от 1 до " + d + " :");

           for (int k = 0; k < arr.length; k++){
               if (arr[k]){

                   System.out.print(k + " ");
               }
            }
        }
    }


