import java.util.Random;

/**
 * Created by yuchugunova on 27.07.2020.
 */

public class Massive {
    public static void main(String[] args) {
        int[] mass = {-735, 910, 995, 767, 82, 2, 77, 6, 345, -941, 736, 301, 936, -9, 100, -4, -29, 542, 711, 36, 659, 5, 259, 999, 89, 336, 974, 88, -33, 36};


//1. Вывести массив в консоль.
        System.out.println("1. Вывести массив в консоль:");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
//2. Вывести в консоль факториалы всех однозначных чисел больше 0 из исходного массива.
        System.out.println("\n\n2. Вывести в консоль факториалы всех однозначных чисел больше 0 из исходного массива:");
        for (int i = 0; i < mass.length; i++) {
            int fact = 1;
            if (((mass[i] / 10) == 0) & (mass[i] > 0)) {  //проверка на порядок числа 2 + положительность
                for (int m = 1; m <= mass[i]; m++) {
                    fact = fact * m;
                }
                System.out.println(mass[i] + "!= " + fact);
            }

        }
//3. Вывести в консоль все двузначные числа перед этим разделив на 2 все четные и умножив на 3 все нечетные среди них.
        System.out.println("\n\n3. Вывести в консоль все двузначные числа перед этим разделив на 2 все четные и умножив на 3 все нечетные среди них.");
        for (int i = 0; i < mass.length; i++) {
            if (((mass[i] / 100) == 0) & ((mass[i] / 10) != 0)) {    //проверка на порядок числа 3
                if ((i % 2) == 0) {                                        //проверка на четность номера
                    System.out.println("Число " + mass[i] + "(порядковый номер " + i + ", чётный): " + mass[i] / 2);
                } else {
                    System.out.println("Число " + mass[i] + "(порядковый номер " + i + ", нечётный): " + (mass[i] * 3));
                }
            }
        }

//4. Вывести в консоль максимальное трехзначное число из тех, что стоят на нечетных местах (местах с нечетным номером).
        System.out.println("\n\n4. Вывести в консоль максимальное трёхзначное число из тех, что стоят на нечётных местах (местах с нечётным номером)");
        int max = (-1000);
        int min = 1000;
        for (int i = 0; i < mass.length; i++) {
            if (((mass[i] / 100) != 0)) {     //проверка на порядок числа 4
                if (((i % 2) != 0)) {
                    if (mass[i] > max) {         //проверка на четность номера
                        max = mass[i];
                    }
                } else {
                    if (mass[i] < min) {   //Для задания 5
                        min = mass[i];
                    }

                }
            }
        }
        if (max == (-1000)) {
            System.out.println("Нет трехзначных чисел на нечётных местах");
        } else {
            System.out.println(max);
        }
//5. Вывести в консоль минимальное трехзначное число из тех, что стоят на четных местах (местах с четным номером).
        System.out.println("\n\n5. Вывести в консоль минимальное трехзначное число из тех, что стоят на чётных местах (местах с чётным номером)");

        if (min == (1000)) {
            System.out.println("Нет трехзначных чисел на четных местах");
        } else {
            System.out.println(min);

        }
    }
}

