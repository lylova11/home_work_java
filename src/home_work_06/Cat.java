package home_work_06;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.maxRun = 200;
    }

    @Override
    public void swim(int dist) {
        System.out.println(this.name + "  не умеет плавать");

    }

}



