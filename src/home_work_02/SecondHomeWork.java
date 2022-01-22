package home_work_02;


public class SecondHomeWork{
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println(compareNumbers(10, 18));

        System.out.println("Задание 2:");
        positiveNumber();

        System.out.println("Задание 3:");
        System.out.println(positiveOrNegative(-10));

        System.out.println("Задание 4:");
        printWordNTimes("Hello", 5);

        System.out.println("Задание 5*:");
        leapYear(2012);
    }


    public static boolean compareNumbers(int a, int b) {
        int summa = a + b;
        return(summa > 10 && summa < 20);
    }

    public static void positiveNumber(){
        int c = 0;
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveOrNegative(int d){
        return (d < 0);
    }

   public static void printWordNTimes(String x, int times){
            for (times = 0; times <5; times++) {
                System.out.println(x);
            }
   }

   public static void leapYear(int year){
        if (!(year % 4 == 0) || (year % 100 == 0) && !(year % 400 == 0)){
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }
   }
}







