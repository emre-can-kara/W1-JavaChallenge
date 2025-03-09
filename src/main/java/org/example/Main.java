package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] emptyHealthPlans = new String[2];

        Plan plan = Plan.BASIC;

        Company company = new Company(1, "John", 13, emptyHealthPlans);
        Employee employee = new Employee(2, "Jane Doe", "Doe@email.com", "123456", emptyHealthPlans);
        Healthplan healthplan = new Healthplan(3, "Mark", plan);
    }
}