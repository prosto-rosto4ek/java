package org.example;

public class Tester {
    public String name;
    public String surname;
    public int experienceInYears;
    public String englishLevel;
    public double salary;

    public Tester() {
        this("name", "surname", 0, "none", 0.0);
    }

    public Tester(String name) {
        this(name, "surname", 0, "none", 0.0);
    }//

    public Tester(String name, String surname) {
        this(name, surname, 0, "none", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Имя " + name + " Фамилия " + surname + " Опыт " + experienceInYears + " лет  Зарплата " + salary);
    }

    public void displayInfo(int years) {
        System.out.println("Имя " + name + " Фамилия " + surname + " Опыт " + (experienceInYears+years) + " лет  Зарплата " + salary);
    }

    public void displayInfo(double salary) {
        System.out.println("Имя " + name + " Фамилия " + surname + " Опыт " + experienceInYears + " лет  Зарплата " + (this.salary + salary));
    }

    public static int fact(int n) {
        if(n<=1){
            return 1;
        }
        int ret=1;
        for(int i=2;i<=n;i++){
            ret*=i;
        }
        return ret;
    }
}
