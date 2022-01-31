package homework05;

public class Hw5 {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван Иванович", "Project Manager", "ivanov@gmail.com", 123123, 100000, 37);


        Employee[] company = {
                employee1,
                new Employee("Сергеев Сергей Сергеевич", "Product Manager", "sergeev@gmail.com", 222333, 105000, 41),
                new Employee("Антонов Антон Антонович", "Lead Web Developer", "antonov@gmail.com", 333333, 115000, 42),
                new Employee("Олегов Олег Олегович", "Lead Mobile Developer", "olegov@gmail.com", 444333, 115000, 33),
                new Employee("Михайлов Михаил Михайлович", "QA Engineer", "mikhailov@gmail.com", 555333, 70000, 28)
        };

        allInfo(company);
        System.out.println("\nThese Employees are over 40 years old:\n");
        overFourtyYears(company);
    }
    private static void allInfo(Employee[] company) {
            for (int i = 0; i < company.length; i++) {
                System.out.println(company[i].getInfo());

            }
        }
    private static void overFourtyYears(Employee[] company) {
        for (int i = 0; i < company.length; i++)
            if (company[i].getAge() > 40) {
                System.out.println(company[i].getInfo());
        }
    }


}
