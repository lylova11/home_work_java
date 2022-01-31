package lessone03;

import java.util.Random;
import java.util.Scanner;

public class ArrayClass {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {


//        studyOneSizeArray();
//    int[][] myArray = new int[][];

//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt(30));
//        }
    }

    public static void studyOneSizeArray() {
        int[] myArrayInt = new int[5];
        myArrayInt[0] = 6;
        myArrayInt[1] = -20;
        myArrayInt[2] = 0;
        myArrayInt[3] = 15;
        myArrayInt[4] = 12;

        System.out.println(myArrayInt[4]);

        String[] myArrayString = new String[500];

        for (int i = 0; i < myArrayString.length; i++){
            myArrayString[i] = "String " + (i + 1);
        }
        System.out.println(myArrayString[324]);

        String[] arrayA = {"A", "B", "C", "d"};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
//        System.out.println(studyScannerString("Enter your name", "Hello "));
//        studyScannerNumbers();


//    public static String studyScannerString(String systemMsg, String welcomeMsg){
//        System.out.print(systemMsg + " > ");
//
//        return welcomeMsg + "    " + scanner.next();
//    }
//
//    public static void studyScannerNumbers() {
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a + b);
//    }



}
