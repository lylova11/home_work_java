package homework05;

// * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//         * 2. Конструктор класса должен заполнять эти поля при создании объекта.
//         * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//         * 4. Создать массив из 5 сотрудников.
//         * Пример:
//         * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//         * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//         * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
//         !!! На Java НЕ используют РУССКИЙ язык !!!



public class Employee {

    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    String getInfo() {
        return this.name + "  " + this.position + "  " + this.email + "  " + this.position + "  " + this.phoneNumber + "  " + this.getSalary() + "  " + this.age;
    }




}
