package home_work_03;


//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 в массиве;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;


public class HomeWork3 {
    public static void main(String[] args) {

        int[] array1 = {1, 0, 1, 0, 1, 1, 1};
        print1DArray(array1);
        change(array1);
        print1DArray(array1);
        System.out.println("*******************");

        int[] array2 = new int[100];
        fillIn(array2);
        print1DArray(array2);
        System.out.println("*******************");

        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        print1DArray(array3);
        doubling(array3);
        print1DArray(array3);
        System.out.println("*******************");

        int side = 10;
        int[][] array4 = new int[side][side];
        crossFill(array4);
        print2DArray(array4);
        System.out.println("*******************");

        int[] returnArrayFromMethod = returnArray(10, 999);
        print1DArray(returnArrayFromMethod);

    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }

    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
           array[i] = i +1;
    }

    public static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
    }

    public static void crossFill(int[][] arr) {
        int abc = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][abc - i] = 1;
        }
    }

    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }


    // Печать одномерного массива в консоль
    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Печать двумерного массива в консоль

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}