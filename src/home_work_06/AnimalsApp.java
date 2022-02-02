package home_work_06;

public class AnimalsApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Бобик");


        cat.run(200);
        cat.swim(4);

        System.out.println();

        dog.run(500);
        dog.swim(10);


    }
}
