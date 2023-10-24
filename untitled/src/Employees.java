public class Employees {
    private String name;
    private String surname;
    private int age;
    private int salary;
    private int workhours;
    private int code;

    public Employees(String name, String surname, int age, int salary, int workhours, int code) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.workhours = workhours;
        this.code = code;
    }

    public void info() {
        System.out.println("Робітник: " + name + " " + surname);
        System.out.println("Вік робітника: " + age);
        System.out.println("Зарплата за договором: " + salary + "$");
    }

    public int calculateSalary() {
        int salarye = workhours * salary;
        System.out.println("Зарплата відносно відпрацьованого часу: " + salarye + "$");
        return salarye;
    }

    public double calculateSalary(double hourlyRate) {
        double salarye = workhours * hourlyRate;
        System.out.println("Зарплата відносно відпрацьованого часу: " + salarye + "$");
        return salarye;
    }
    void recursivePrint(String str, int times) {
        if (times <= 0) {
            return;
        }
        System.out.println(str);
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
