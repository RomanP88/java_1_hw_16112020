package hw5;

public class Person {
    private String surname;
    private String name;
    private String fatherhood;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Person(String surname, String name, String fatherhood, String position, String email, long phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.fatherhood = fatherhood;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }




    public void getInfo (){
        System.out.printf(" %s %s %s\n %s\n %s\n %d\n %d\n %d\n",surname, name, fatherhood, position, email, phone, salary, age);
    }


    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Person[] personArray = {
                new Person("Petrov", "Petr", "Petrovic", "Developer", "petrov@mail.ru", 89005578660L, 30000, 18),
                new Person("Ivanov", "Ivan", "Ivanovic", "Manager", "ivanov@mail.ru", 89005578661L, 40000, 19 ),
                new Person("Sokolov","Aleksey", "Alekseevic", "Logistician", "sokolov@mail.ru", 89005578662L, 50000, 41 ),
                new Person("Bogus",  "Maksim", "Olegivic", "Deputy Director", "boguss88@mail.ru", 89005578670L, 60000, 25 ),
                new Person("Baranov","Oleg", "Pavlovic", "Director", "baranov@mail.ru", 89005578628L, 100000, 45 )
        };



        for (int i = 0; i < personArray.length; i++) {

            if (personArray[i].getAge() >= 40) {
                System.out.println();
                personArray[i].getInfo();
            }
        }
    }
}
