/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */

public class Freelancer extends Employee {
    private Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    public static Freelancer create(String surName, String name, double salary){
        return new Freelancer(surName, name, salary);
    }


    @Override
    public double calculateSalary() {
        return salary*8*20.6;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер %s %s; возраст: %d лет; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }
}
