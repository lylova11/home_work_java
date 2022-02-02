package home_work_06;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//        Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.
//        !!! Организация в разных классе !!!
//        !!! К сдаче 4 класса(файла) !!!

public class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;


    public Animal(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist)
            System.out.println(this.name + " пробежал " + dist + " метров");
        else System.out.println(this.name + " столько не пробежит");
    }
    public void swim(int dist) {
        if (this.maxSwim >= dist)
            System.out.println(this.name + " проплыл " + dist + " метров");
        else System.out.println(this.name + " столько не проплывет");
    }

}
